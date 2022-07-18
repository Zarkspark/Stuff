import random
# Imports the random library for generating a random number.

scores = []
# Array for the scores
def generate():
    # A method for generating a random number
    x = random.randint(0,100)
    return x

leaderboard = open("Leaderboard.txt","a")
# A line for creating a new text file called "Leaderboard.txt"

leaderchoice = ' '
topchoice = ' '
choice = ' '
counter = 0
user = " "
x=generate()
retry=1
userattempts = 0
temp = " "
# creates variables and assigns starting values.

while (retry==1):
# While loop for looping through the game.
    print(str(x))
    guess = input("Guess my number (From 0-100)")
    userattempts = userattempts+1
    counter = counter+1
    # Increments counter by 1 after user makes an attempt to guess.

    if(guess.isdigit() == True):
    # Checks if the guess is an integer or not.

        if(int(guess) == x):
        # User has guessed correctly. Displays the number of attempts and asks the user if they want to play again.
            print("Well done you guessed correctly!")
            user = input("Please enter your username.\n")
            # Asks the user to input their username and assigns the username to the variable 'user'.

            
            leaderboard = open("Leaderboard.txt","a")
            # Switches to the append mode to write to the leaderboard.txt file

            leaderboard.write(str(counter) + " - Attempts | " + " Username - " + user + "\n")
            # Writes the username and the number of attempts taken to the leaderboard.

            scores.append(str(counter) + " - " + user)
            # Appends the score and the username of the user to a list
            
            scores.sort()
            # Sorts the list in ascending order
            
            print(scores)
            # Prints the scores array for testing

            leaderchoice = input("Would you like to view the leaderboard?\n")
            # Asks the user if they want to view the leaderboard and assigns the user's input to the variable 'leaderboard'.
            

            if(leaderchoice == 'y'):
            # User inputted 'y'. Reads the leaderboard and prints the contents.
                leaderboard = open("Leaderboard.txt","r")
                for line in leaderboard.readlines():
                    # Prints the entire leaderboard.txt file
                    print(line)

                topchoice = input("Would you like to view the top players? ")
                if(topchoice == 'y'):
                    for v in range(0,len(scores)):
                        print(str(v+1) + ". " + scores[v])
                        # prints the place of the user and their score using a for loop
                else:
                    print("Okay.")

            elif(leaderchoice == 'n'):
            # User inputted 'n'. Continues the program.
                break

            else:
            # User did not input 'y' or 'n'. Automatically continues the program.
                break

            choice = input("Would you like to play again? y or n?.\n")
            # Asks the user if they want to play again and assigns the user input to the choice variable.
            if(choice == 'n'):
            # User inputted 'n'. Escapes out of the while loop and exits the game.
                break
            elif(choice == 'y'):
            # User inputted 'y'. Restarts the game, generates a new random number and sets the counter to 0 again. (loops back).
                leaderboard = open("Leaderboard.txt","a")
                x=generate()
                counter=0
                retry=1
                continue
            else:
            # User did not input y or n. Automatically exits the game.
                print("You did not type y or n.")
                break

        elif(int(guess) > x):
        # User's guess was too large. Asks the user to try again (loops back).
            print("Your guess is too high! Try again")

        elif(int(guess) < x):
        # User's guess was too small. Asks the user to try again (loops back).
            print("Your guess is too low! Try again")
    else:
    # User did not input an integer. Asks the user to input an integer. (loops back).
        print("Guess is not an integer. Please input an integer.")
        retry=1
        
leaderboard.close()
# Closes the leaderboard file after use.

delete = input("Would you like to clear the Leaderboard?. ")
if delete == 'y':
    leaderboard = open("Leaderboard.txt","w")
    scores.clear()

    print("Done")

print("Ok bye bye")