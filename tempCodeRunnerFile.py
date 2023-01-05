def playagain():
    again = True
    choice = input("Would you like to play again? type 1 for yes and 0 for no.\n")
    while again == True:
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