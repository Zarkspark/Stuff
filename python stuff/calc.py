import math
import random

def menu():
    print("Basic or scientific? (b or s)")
    op = input()
    if(op == 'b'):
        basic()
    elif(op == 's'):
        sci()
    else:
        print("What")
    
def basic():
    print("This is basic mode")
    print("Pick an option. a - addition. s - subtraction. m - multiplication. d - division.")
    bop = input()
    if(bop == 'a'):
        print("Input 2 numbers.")
        num1 = int(input())
        num2 = int(input())
        res = num1+num2
        print(res)
    elif(bop == 's'):
        print("Input 2 numbers.")
        num1 = int(input())
        num2 = int(input())
        res = num1-num2
        print(res)
    elif(bop == 'm'):
        print("Input 2 numbers.")
        num1 = int(input())
        num2 = int(input())
        res = num1*num2
        print(res)
    elif(bop == 'd'):
        print("Input 2 numbers.")
        num1 = int(input())
        num2 = int(input())
        res = num1/num2
        print(res)
    else:
        print("What")

def sci():
    print("This is scientific mode")
    print("Pick an option. S - sin(). C - cos(). T - tan(). s - sqrt. e - exponential.")
    sop = input()
    if(sop == 'S'):
        print("Input a number.")
        num1 = int(input())
        res = math.sin(num1)
        print(res)
    elif(sop == 'C'):
        print("Input a number.")
        num1 = int(input())
        res = math.cos(num1)
        print(res)
    elif(sop == 'T'):
        print("Input a number.")
        num1 = int(input())
        res = math.tan(num1)
        print(res)
    elif(sop == 's'):
        print("Input a number.")
        num1 = int(input())
        res = math.sqrt(num1)
        print(res)
    elif(sop == 'd'):
        print("Input 2 numbers.")
        num1 = int(input())
        num2 = int(input())
        res = num1**num2
        print(res)
    else:
        print("What")

menu()