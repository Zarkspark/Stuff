import random
import time

leaderboard = open("Multiplicationleaderboard.txt","a")
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
        difficulty = (input("Please pick a difficulty: EASY STANDARD HARD\n")).upper()
        if difficulty != "EASY":
            if difficulty != "STANDARD":
                if difficulty != "HARD":
                    print("Try again.")
                else:
                    print("your difficulty is " + difficulty)
                    difficultyagain = False
                    hard(username)
            else:
                    print("your difficulty is " + difficulty)
                    difficultyagain = False
                    standard(username)
        else:
                    print("your difficulty is " + difficulty)
                    difficultyagain = False
                    easy(username)


def easy(username):
    starttime = time.time()
    answer = 0
    correct = 0
    print("You have to answer 10 questions. Ready? GO!\n")
    for i in range(10):
        x = random.randint(1,10)
        y = random.randint(1,10)
        answer = input(str(i+1) + ") " + "What is " + str(x) + "x" + str(y) + "?\n")
        if answer.isdigit() == True:
            if int(answer) == (x*y):
                print("Correct!")
                correct = correct+1
            else:
                print("Incorrect.")
        else:
            print("Input is not a digit.")

    endtime = time.time()
    timetaken = endtime-starttime
    score = int(((correct**2)//4) * timetaken)
    print("You got " + str(correct) + " questions correct. In " + str(timetaken))
    print("Your score is " + str(score))
    leaderboardwrite(username,score,timetaken)
    playagain()
    

def standard(username):
    starttime = time.time()
    answer = 0
    correct = 0
    print("You have to answer 10 questions. Ready? GO!\n")
    for i in range(10):
        x = random.randint(2,12)
        y = random.randint(2,12)
        answer = input(str(i+1) + ") " + "What is " + str(x) + "x" + str(y) + "?\n")
        if answer.isdigit() == True:
            if int(answer) == (x*y):
                print("Correct!")
                correct = correct+1
            else:
                print("Incorrect.")
        else:
            print("Input is not a digit.")

    endtime = time.time()
    timetaken = endtime-starttime
    score = int(((correct**2)//4) * timetaken)
    print("You got " + str(correct) + " questions correct. In " + str(timetaken))
    print("Your score is " + str(score))
    leaderboardwrite(username,score,timetaken)
    playagain()

def hard(username):
    starttime = time.time()
    answer = 0
    correct = 0
    print("You have to answer 10 questions. Ready? GO!\n")
    for i in range(10):
        x = random.randint(3,15)
        y = random.randint(3,15)
        answer = input(str(i+1) + ") " + "What is " + str(x) + "x" + str(y) + "?\n")
        if answer.isdigit() == True:
            if int(answer) == (x*y):
                print("Correct!")
                correct = correct+1
            else:
                print("Incorrect.")
                print("The correct answer was " + str(x*y))
        else:
            print("Input is not a digit.")

    endtime = time.time()
    timetaken = endtime-starttime
    score = int(((correct**2)//4) * timetaken)
    print("You got " + str(correct) + " questions correct. In " + str(timetaken))
    print("Your score is " + str(score))
    leaderboardwrite(username,score,timetaken)
    playagain()

def leaderboardwrite(username,score,timetaken):
    leaderboard = open("Multiplicationleaderboard.txt","w")
    # This clears the leaderboard so that we can write the sorted list to it later

    leaderboard = open("Multiplicationleaderboard.txt","a")
    # This allows us to append things to the leaderboard.

    scoretable.append(str(score) + " - " + username + " in " + str(timetaken) + "seconds")
    scoretable.sort(reverse=True)
    print(scoretable)
    size = len(scoretable)
    for i in range(size):
        leaderboard.write(scoretable[i]+"\n")
    
def playagain():
    again = True
    while again == True:
        choice = input("Would you like to play again? type 1 for yes and 0 for no.\n") 
        if choice.isdigit() == True:
            if int(choice) == 1:
                menu()
                again = False
            else:
                print("Okay then.")
                leaderboard.close()
                scoretable.clear()
                again = False
        else:
            print("You did not type the correct input. Try again.\n")
menu()

# We could sort the table, write it to the leaderboard then when the next user comes along and finishes, then we can clear the leaderboard and sort it again and so on hehehehehehhe....