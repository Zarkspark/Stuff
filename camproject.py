import random
import time

leaderboard = open("Leaderboard.txt","a")
scoretable = []

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
        difficulty = (input("Please pick a difficulty: easy medium hard\n")).upper()
        if difficulty != "EASY":
            if difficulty != "MEDIUM":
                if difficulty != "HARD":
                    print("Please only enter EASY MEDIUM or HARD.")
                else:
                    print("your difficulty is " + difficulty)
                    difficultyagain = False
                    hard(username)
            else:
                    print("your difficulty is " + difficulty)
                    difficultyagain = False
                    medium(username)
        else:
                    print("your difficulty is " + difficulty)
                    difficultyagain = False
                    easy(username)

def easy(username):
    correct = 0
    start = time.time()
    for i in range(10):
        number1 = random.randint(1,10)
        number2 = random.randint(1,10)
        answer = input("Question " + str(i+1) + ": What is " + str(number1) + " x " + str(number2) + "\n")
        if answer.isdigit() == True:
            if int(answer) == number1 * number2:
                print("correct")
                correct = correct + 1
            else:
                print("Incorrect. The answer was " + str(number1*number2))
        else:
            print("Input is not a number")
    end = time.time()
    totaltime = end-start
    score = int(((correct**2)//4) * 1/timetaken)
    print("Well done " + username + " You got " + str(correct) + " questions right in " + str(totaltime) + " seconds.")
    leaderboardw(username,score,totaltime)
    playagain()

def medium(username):
    correct = 0
    start = time.time()
    for i in range(10):
        number1 = random.randint(2,12)
        number2 = random.randint(2,12)
        answer = input("Question " + str(i+1) + ": What is " + str(number1) + " x " + str(number2) + "\n")
        if answer.isdigit() == True:
            if int(answer) == number1 * number2:
                print("correct")
                correct = correct + 1
            else:
                print("Incorrect. The answer was " + str(number1*number2))
        else:
            print("Input is not a number")
    end = time.time()
    totaltime = end-start
    score = int(((correct**2)//4) * 1/timetaken)
    print("Well done " + username + " You got " + str(correct) + " questions right in " + str(totaltime) + " seconds.")
    leaderboardw(username,score,totaltime)
    playagain()

def hard(username):
    correct = 0
    start = time.time()
    for i in range(10):
        number1 = random.randint(3,15)
        number2 = random.randint(3,15)
        answer = input("Question " + str(i+1) + ": What is " + str(number1) + " x " + str(number2) + "\n")
        if answer.isdigit() == True:
            if int(answer) == number1 * number2:
                print("correct")
                correct = correct + 1
            else:
                print("Incorrect. The answer was " + str(number1*number2))
        
        else:
            print("Input is not a number")

    end = time.time()
    totaltime = end-start
    score = int(((correct**2)//4) * 1/timetaken)
    print("Well done " + username + " You got " + str(correct) + " questions right in " + str(totaltime) + " seconds.")
    leaderboardw(username,score,totaltime)
    playagain()

def leaderboardw(username,score,totaltime):
    scoretable.append(str(score) + " - score " + username + " in " + str(totaltime) + " seconds\n")
    size = len(scoretable)
    for i in range(size):
        leaderboard.write(scoretable[i])
    scoretable.clear()
    

def playagain():
    play = True
    while play == True:
        choice = (input("Play again? y/n")).upper()
        if choice == "Y":
            menu()
            play = False
        elif choice == "N":
            print("Okay")
            leaderboard.close()
            play = False
        else:
            print("You did not enter Y or N. Try again")
            
menu()