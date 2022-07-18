import random
random = random.randint(0,100)
choice = 'y'
counter = 0
while (choice == 'y'):
    guess = int(input("Guess my number (From 0-100)"))
    counter = counter+1
    if(guess == random):
        print("Well done you guessed correctly!")
        print("You have made " + str(counter) + " attempts to guess.")
        choice = input("Would you like to play again? y or n?.\n")
        break
    if(guess > random):
        print("Your guess is too high! Try again")
    else:
        print("Your guess is too low! Try again")
print("Ok bye bye")
