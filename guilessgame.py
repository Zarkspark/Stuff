import random
import time
# Imports the random and time modules to take the time and to generate the random numbers required for the questions

leaderboard = open("Multiplicationleaderboard.txt","a")
scoretable = []
# Initializes the leaderboard file and the scoretable array

def menu():
# This function is used to take the first and second name of the user and create the username and take the difficulty the user wants and call the correct function for each difficulty 

    difficulty = ""
    # Initally sets the difficuty string to nothing

    difficultyagain = True
    # Intially sets the difficultyagain variable to true in order to allow the while loop to be executed

    firstname = input("Please enter your first name.\n")
    secondname = input("Please enter your surname.\n")
    # Takes in the input for the firstname and secondname of the user in order to create the username

    firstname = firstname[0:3]
    secondname = secondname[0:3]
    # Takes the first 3 letters of each input and allocates the values to the firstname and secondname variable

    username = firstname.lower() + secondname.upper()
    # Concatenates the new firstname (in lower case) and the new secondname (in upper case)

    print("Your username is " + username)
    # Prints the username for the user

    while difficultyagain == True:
    # While loop used to keep executing the instructions until the user inputs the expected values

        difficulty = (input("Please pick a difficulty: EASY STANDARD HARD\n")).upper()
        # Takes in the input for the user's chosen difficulty, capitalises it, then stores it in the difficulty variable for checking later

        if difficulty != "EASY":
        # Checks if the user has NOT entered EASY as the difficulty

            if difficulty != "STANDARD":
            # Checks if the user has NOT entered STANDARD as the difficulty

                if difficulty != "HARD":
                # Checks if the user has NOT entered HARD as the difficulty

                    print("Please only enter EASY STANDARD or HARD.")
                    # The user has not entered EASY STANDARD or HARD so the user is asked to input the correct value

                else:
                # The user has entered HARD as the difficulty

                    print("your difficulty is " + difficulty)
                    # Tells the user their difficulty

                    difficultyagain = False
                    # Sets difficultyagain to false in order to exit the while loop

                    hard(username)
                    # Calls the hard() function and parses the username into the function

            else:
            # The user has entered STANDARD as the difficulty

                    print("your difficulty is " + difficulty)
                    # Tells the user their difficulty

                    difficultyagain = False
                    # Sets difficultyagain to false in order to exit the while loop

                    standard(username)
                    # Calls the standard() function and parses the username into the function

        else:
        # The user has entered EASY as the difficulty

                    print("your difficulty is " + difficulty)
                    # Tells the user their difficulty

                    difficultyagain = False
                    # Sets difficultyagain to false in order to exit the while loop'

                    easy(username)
                    # Calls the easy() function and parses the username into the function


def easy(username):
# This function is used to ask the random multiplication questions in the easy difficulty and record the score and the time taken

    starttime = time.time()
    # We can record the time before the for loop is executed in otder to get the start time for the user to complete the questions

    answer = 0
    correct = 0
    print("You have to answer 10 questions. Ready? GO!\n")
    for i in range(10):
    # The range of 10 is used as there are only ten questions that need to be asked

        x = random.randint(1,10)
        y = random.randint(1,10)
        # Initializes the random numbers and stores them in variables for printing

        answer = input(str(i+1) + ") " + "What is " + str(x) + "x" + str(y) + "?\n")
        # Prints a random question to the user and allocates the input to a variable so that it can be checked later on

        if answer.isdigit() == True:
        # This is used to determine if the answer input is an integer or not

            if int(answer) == (x*y):
            # Checks if the answer is actually the correct answer

                print("Correct!")
                correct = correct+1
                # Increments the correct variable as it shows the amount of questions each user gets right
            else:
                print("Incorrect.")
                print("The correct answer was " + str(x*y))
                # Prints the correct answer for the user if they get the wrong answer
        else:
            print("Input is not a digit.")
            # If the answer is not an integer this will skip the question and tell the user that the answer is not a number

    endtime = time.time()
    # We can record the time after the for loop is completed in order to get the end time for the user to complete the questions

    timetaken = endtime-starttime
    # We can calculate the time taken by finding the difference of the start time and end time

    score = int(((correct**2)//4) * timetaken)
    print("You got " + str(correct) + " questions correct. In " + str(timetaken))
    print("Your score is " + str(score))
    leaderboardwrite(username,score,timetaken)
    # Calls the leaderboardwrite() function and parses the username, score and the time taken into the function for the leaderboard to be updated

    playagain()
    # Calls the playagain() function in order to ask if the user wants to play once more
    

def standard(username):
# This function is used to ask the random multiplication questions in the standard difficulty and record the score and the time taken
    starttime = time.time()
    # We can record the time before the for loop is executed in otder to get the start time for the user to complete the questions

    answer = 0
    correct = 0
    print("You have to answer 10 questions. Ready? GO!\n")
    for i in range(10):
    # The range of 10 is used as there are only ten questions that need to be asked

        x = random.randint(2,12)
        y = random.randint(2,12)
        # Initializes the random numbers and stores them in variables for printing

        answer = input(str(i+1) + ") " + "What is " + str(x) + "x" + str(y) + "?\n")
        # Prints a random question to the user and allocates the input to a variable so that it can be checked later on

        if answer.isdigit() == True:
        # This is used to determine if the answer input is an integer or not

            if int(answer) == (x*y):
            # Checks if the answer is actually the correct answer

                print("Correct!")
                correct = correct+1
                # Increments the correct variable as it shows the amount of questions each user gets right
            else:
                print("Incorrect.")
                print("The correct answer was " + str(x*y))
                # Prints the correct answer for the user if they get the wrong answer
        else:
            print("Input is not a digit.")
            # If the answer is not an integer this will skip the question and tell the user that the answer is not a number

    endtime = time.time()
    # We can record the time after the for loop is completed in order to get the end time for the user to complete the questions

    timetaken = endtime-starttime
    # We can calculate the time taken by finding the difference of the start time and end time

    score = int(((correct**2)//4) * timetaken)
    print("You got " + str(correct) + " questions correct. In " + str(timetaken))
    print("Your score is " + str(score))
    leaderboardwrite(username,score,timetaken)
    # Calls the leaderboardwrite() function and parses the username, score and the time taken into the function for the leaderboard to be updated

    playagain()
    # Calls the playagain() function in order to ask if the user wants to play once more

def hard(username):
# This function is used to ask the random multiplication questions in the hard difficulty and record the score and the time taken

    starttime = time.time()
    # We can record the time before the for loop is executed in otder to get the start time for the user to complete the questions

    answer = 0
    correct = 0
    print("You have to answer 10 questions. Ready? GO!\n")
    for i in range(10):
    # The range of 10 is used as there are only ten questions that need to be asked

        x = random.randint(3,15)
        y = random.randint(3,15)
        # Initializes the random numbers and stores them in variables for printing

        answer = input(str(i+1) + ") " + "What is " + str(x) + "x" + str(y) + "?\n")
        # Prints a random question to the user and allocates the input to a variable so that it can be checked later on

        if answer.isdigit() == True:
        # This is used to determine if the answer input is an integer or not

            if int(answer) == (x*y):
            # Checks if the answer is actually the correct answer

                print("Correct!")
                correct = correct+1
                # Increments the correct variable as it shows the amount of questions each user gets right
            else:
                print("Incorrect.")
                print("The correct answer was " + str(x*y))
                # Prints the correct answer for the user if they get the wrong answer
        else:
            print("Input is not a digit.")
            # If the answer is not an integer this will skip the question and tell the user that the answer is not a number

    endtime = time.time()
    # We can record the time after the for loop is completed in order to get the end time for the user to complete the questions

    timetaken = endtime-starttime
    # We can calculate the time taken by finding the difference of the start time and end time

    score = int(((correct**2)//4) * timetaken)
    print("You got " + str(correct) + " questions correct. In " + str(timetaken))
    print("Your score is " + str(score))
    leaderboardwrite(username,score,timetaken)
    # Calls the leaderboardwrite() function and parses the username, score and the time taken into the function for the leaderboard to be updated

    playagain()
    # Calls the playagain() function in order to ask if the user wants to play once more

def leaderboardwrite(username,score,timetaken):
# This function is used to write the score, username and time taken for each user to complete the questions to the leaderboard
# It takes in the values for the username, the score and the timetaken to do this

    leaderboard = open("Multiplicationleaderboard.txt","r")
    # leaderboard = open("Multiplicationleaderboard.txt","w")
    #! Error here was that the leaderboard would be cleared (because it was in write mode) after the user stopped the game, causing the scores of the players to be lost.
    #? Hopefully a fix: Change the mode to read and read the lines of the leaderboard, then append everything to the scoretable so it can be sorted along with the other user's scores
    # This clears the leaderboard so that we can write the sorted list to it later

    for lines in leaderboard.readlines():
        print(lines)
    
    leaderboard = open("Multiplicationleaderboard.txt","a")
    # This allows us to append things to the leaderboard.

    scoretable.append(str(score) + " - " + username + " in " + str(timetaken) + "seconds")
    # Appends the score, the username and the time taken to the scoretable array

    scoretable.sort(reverse=True)
    # Sorting the array in reverse means sorting it from highest to lowest, making the scores go down from highest to lowest too
    
    print(scoretable)
    size = len(scoretable)
    # Allocates the size value of the scoretable array into a variable for the for loop range

    for i in range(size):
    # Loops the instructions until the end of the array using the size of the array as the range

        leaderboard.write(scoretable[i]+"\n")
        # Used to write all of the contents of the scoretable array onto the leaderboard.txt file
    
def playagain():
# This function is used to ask the user if they want to play the game again

    again = True
    # Sets the again variable to true initally so that the while loop can start

    while again == True:
    # While loop used to keep looping until the user inputs the expected values

        choice = input("Would you like to play again? type 1 for yes and 0 for no.\n")
        # The user is asked to input a 1 for yes and a 0 for no (For playing the game again) and the value is allocated to a variable to be checked later

        if choice.isdigit() == True:
        # This is used to determine if the input is an integer or not

            if int(choice) == 1:
            # If the user chooses to play again

                menu()
                # Calls the menu() function to start the game again

                again = False
                # Sets the again variable to false to exit the while loop

            else:
            # If the user chooses to quit the game

                print("Goodbye!")
                leaderboard.close()
                # Closes the text file in order to avoid memory leaks
                
                scoretable.clear()
                # Clears the scoretable array

                again = False
                # Sets the again variable to false to exit the while loop

        else:
        # If the user did not enter 1 or 0

            print("You did not type the correct input. Try again.\n")
            # If the input is not an integer, the program will loop and tell the user to input the correct datatype

menu()
# Calls the menu() function in order to actually start the game