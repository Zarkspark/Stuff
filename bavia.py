import random
import time

scores = []

def diff():
    global total
    First_name = input("Please enter your first name.")
    while not First_name.isalpha():
        First_name=input("please enter your first name again ")


    Second_name = input("Please enter your surname.")
    while not Second_name.isalpha():
        Second_name=input("please enter your second name again ")

    LOWER = First_name.lower()
    UPPER = Second_name.upper()
    USERNAME = (LOWER[0:3] + UPPER[0:3])
    Diff = input("Please select a difficulty between EASY,STANDARD and HARD - Test will start straight away")
    S = 0


    if Diff == ("EASY"):
        i = 1
        S = 0
        start = time.time()
        while i <11:
            num1 = random.randint(1, 10)
            num1 = int(num1)
            num2 = random.randint(1, 10)
            num2 = int(num2)
            total = (num2 * num1)
            num1 = str(num1)
            num2 = str(num2)
            print("--Question " + str(i) + "--\n")
            usrDisplay = int(input("What is " + num2 + "*" + num1))

            if usrDisplay == total:
                S = S + 1
                i=i+1
            else:

                print("Incorrect! Correct answer- (" + str(total) + ")")
                i = i + 1

        print("Your score is " + str(S))
        stop = time.time()
        duration = int(stop - start)
        duration = str(duration)
        print("You finished the test in " + duration + " seconds.")
        scores = [str(S) + " - score, time: " + str(duration)]
        EASY_LEADERBOARD=[]
        sortedleaderboard=sorted(EASY_LEADERBOARD,reverse=True)
        templeader=(str(sortedleaderboard)+"is score"+ duration+" seconds "+ USERNAME+"\n")
        file = open("leaderboardE.txt", "a")

        file.write(templeader)
        file.close()

        Option = input("Do you want to see the leaderboard? Y/N")

        if Option == ("Y"):
            file = open("leaderboardE.txt", "r")
            file = file.readlines()
            sortedfile=sorted(templeader, reverse=True)
            print(file)



    elif Diff == ("STANDARD"):
        b = 1
        S = 0
        start = time.time()
        while b < 11:
            num1 = random.randint(2, 12)
            num1 = int(num1)
            num2 = random.randint(2, 12)
            num2 = int(num2)
            total = (num2 * num1)
            num1 = str(num1)
            num2 = str(num2)
            print("--Question " + str(b) + "--\n")
            usrDisplay = input("What is " + num2 + "*" + num1)
            usrDisplay = int(usrDisplay)
            if usrDisplay == total:
                S = S + 1
                b=b+1

            else:
                print("Incorrect! Correct answer- (" + str(total) + ")")
                b = b + 1

        total = str(total)

        print("Your score is " + str(S))
        stop = time.time()
        duration = stop - start
        duration = int(duration)
        duration = str(duration)
        print("Well done you have finished the test in " + duration + " seconds.")
        scores = [str(S) + " - score, time: " + str(duration)]
        file = open("leaderboardS.txt", "a")
        file.write(
            "-----" + str(S) + " points" + " , " + str(USERNAME) + " , " + str(duration) + " seconds" + "-----"+"\n")
        file.close()

        Option = input("Do you want to see the leaderboard? Y/N")

        if Option == ("Y"):
            file = open("leaderboardS.txt", "r")
            file = file.readlines()
            print(file)



    if Diff == ("HARD"):
        c = 1
        S = 0
        start = time.time()
        while c < 11:
            num1 = random.randint(3, 15)
            num1 = int(num1)
            num2 = random.randint(3, 15)
            num2 = int(num2)
            total = (num2 * num1)
            num1 = str(num1)
            num2 = str(num2)
            print("--Question " + str(c) + "--\n")
            usrDisplay = input("What is " + num2 + "*" + num1)
            usrDisplay = int(usrDisplay)
            if usrDisplay == total:
                S = S + 1
                c=c+1
            else:
                print("Incorrect! Correct answer- (" + str(total) + ")")
                c = c + 1
            total = str(total)

        print("Your score is " + str(S))
        stop = time.time()
        duration = stop - start
        duration = int(duration)
        duration = str(duration)
        print("well done you have finished the test in " + duration + " seconds.")
        scores = [str(S) + " - score, time: " + str(duration)]
        file = open("leaderboardH.txt", "a")
        file.write(
            "-----" + str(S) + " points" + " , " + str(USERNAME) + " , " + str(duration) + " seconds" + "-----")

        Option = input("Do you want to see the leaderboard? Y/N")

        if Option == ("Y"):
            file = open("leaderboardH.txt", "r")
            file = file.readlines()
            print(file)

        else:
            file.close()




diff()