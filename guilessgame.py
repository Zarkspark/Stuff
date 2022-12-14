import random

def menu():
    difficulty = ""
    difficultyagain = True
    firstname = input("Please enter your first name.\n")
    secondname = input("Please enter your surname.\n")
    firstname = firstname[0:3]
    secondname = secondname[0:3]
    username = firstname.lower() + secondname.upper()
    print("Your username is " + username)

    while difficultyagain == True:
        difficulty = (input("Please pick a difficulty: EASY STANDARD HARD\n")).upper()
        if difficulty != "EASY":
            if difficulty != "STANDARD":
                if difficulty != "HARD":
                    print("Try again.")
                else:
                    print("your difficulty is " + difficulty)
                    difficultyagain = False
                    hard()
            else:
                    print("your difficulty is " + difficulty)
                    difficultyagain = False
                    standard()
        else:
                    print("your difficulty is " + difficulty)
                    difficultyagain = False
                    easy()


def easy():
    answer = 0
    correct = 0
    print("You have to answer 10 questions. Ready? GO!\n")
    for i in range(10):
        x = random.randint(1,10)
        y = random.randint(1,10)
        answer = int(input(str(i+1) + ") " + "What is " + str(x) + "x" + str(y) + "?\n"))
        if answer == (x*y):
            print("Correct!")
            correct = correct+1
        else:
            print("Incorrect.")
    print("You got " + str(correct) + " questions correct.")

def standard():
    answer = 0
    correct = 0
    print("You have to answer 10 questions. Ready? GO!\n")
    for i in range(10):
        x = random.randint(2,12)
        y = random.randint(2,12)
        answer = int(input(str(i+1) + ") " + "What is " + str(x) + "x" + str(y) + "?\n"))
        if answer == (x*y):
            print("Correct!")
            correct = correct+1
        else:
            print("Incorrect.")
    print("You got " + str(correct) + " questions correct.")

def hard():
    answer = 0
    correct = 0
    print("You have to answer 10 questions. Ready? GO!\n")
    for i in range(10):
        x = random.randint(3,15)
        y = random.randint(3,15)
        answer = int(input(str(i+1) + ") " + "What is " + str(x) + "x" + str(y) + "?\n"))
        if answer == (x*y):
            print("Correct!")
            correct = correct+1
        else:
            print("Incorrect.")
    print("You got " + str(correct) + " questions correct.")
            
menu()