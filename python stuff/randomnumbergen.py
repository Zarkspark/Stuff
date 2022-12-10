import tkinter as tk
import random
def darkmode():
    window.config(bg="black")
    button.config(bg="black", fg="white")
    message.config(bg="black", fg="white")
    light_button.config(bg="black", fg="white")
    dark_button.config(bg="black", fg="white")
    randomnessscale.config(bg="black", fg="white", troughcolor="black")

def lightmode():
    window.config(bg="white")
    button.config(bg="white", fg="black")
    message.config(bg="white", fg="black")
    light_button.config(bg="white", fg="black")
    dark_button.config(bg="white", fg="black")
    randomnessscale.config(bg="white", fg="black", troughcolor="#c8c8c8")

def enter():
    n = random.randint(0,int(randomnessscale.get()))
    message.config(text=str(n))

window = tk.Tk()
window.geometry("300x300")
message = tk.Label(text=" ")
button = tk.Button(text="Random number",command=enter)
light_button = tk.Button(text="Light theme", command=lightmode)
dark_button = tk.Button(text="Dark theme", command=darkmode)
randomnessscale = tk.Scale(from_=0, to=100, orient="horizontal")
button.pack()
light_button.pack()
dark_button.pack()
message.pack()
randomnessscale.pack()
window.mainloop()