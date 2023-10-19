import math

def Bi16():
    x=-1
    for a in range(0,2):
        for b in range(0,2):
            for c in range(0,2):
                for d in range(0,2):
                    x=x+1
                    print(a,b,c,d,"=",x)

def DenToBi():
    choice = "" # Initialises variables for while loops
    Repeat = True
    number = input("Enter your Denary number: ") # denary number input is outside main while loop to ensure the user can convert again if they want to
    while(Repeat==True): # Main while loop:
        choiceloop = True 
        result = ""
        if(number.isdigit() == True): # Validation: first checks if denary number is an integer
            workingnumber = int(number) # If so, the string value is casted to an integer inside another variable for working
            if(workingnumber <= 255 and workingnumber >= 0): # Range check: checks if denary number less than or equal to 255 and greater than or equal to 0
                while(workingnumber!=0): # Working while loop: (runs while the working number is above 0)
                    for i in range(0,8):
                        if(workingnumber % 2 == 1): # If the modulus of the working number and 2 is 0, then the bit added is a '1'
                            result =  "1" + result
                        elif(workingnumber % 2 == 0): # Else if the modulus of the working number and 2 is 1, then the bit added is a '0'
                            result = "0" + result
                        workingnumber = workingnumber // 2 # The working number is floor divided by 2
            else:
                print("Invalid range") # If the number is not between 0 and 255 inclusive, the user has to input the number again
        else:
            print("Enter a valid number.") # If the number entered is not a number, the user has to input the number again
        print(number, "in denary is", result, "in binary") # prints the result
        while(choiceloop == True): # Choice while loop: 
                choice = input("Convert again?(Y/N)") # Asks the user if they want to convert again and stores it in a variable
                choice = choice.upper() # It is capitalised to make selection simpler 
                if(choice == "Y" or choice == "YES"): # If the user types yes or y:
                    number = input("Enter your Denary number: ") # User is asked to enter their denary number and the main while loop repeats
                    choiceloop = False
                    Repeat = True
                elif(choice == "N" or choice == "NO"): # Or if the user types in no or n:
                    print("Okay goodbye!") # Exits the choice and the main while loop and goes back to the menu
                    choiceloop = False
                    Repeat = False
                else:
                    print("Invalid choice, type yes, y or no, n.") # If the choice is not any of the specified choices, the user has to try again

def BiToDen():
    choice = "" # Initialises variables for while loops
    Repeat = True
    binumber = input("Enter a binary number that is 8 bits long  ") # binary number input is outside main while loop to ensure the user can convert again if they want to
    while(Repeat == True):# Main while loop:
        choiceloop = True
        denresult = 0
        arraylength = len(binumber)
        flag = 0
        for j in range(0,arraylength):
            if(binumber[j].isdigit() == False):
                flag = flag+1
            elif(int(binumber[j]) > 1):
                flag = flag+1
            else:
                flag = flag
        if(flag > 0):
            print("Invalid binary number")
        if(flag == 0):
            if(arraylength == 8):
                for i in range(7,-1,-1):
                    z = i-7
                    if(z<0):
                        z=z*-1
                    
                    if(binumber[z] == "1"):
                        denresult = denresult + pow(2,i)
                        #? Error: LTR reading error fixed.
                print(binumber,"in binary is",denresult,"in denary.")
            elif(arraylength < 8):
                print("Binary number is too short.")
            else:
                print("Binary number is too large.")
        while(choiceloop == True):
            choice = input("Convert again?(Y/N)")
            if(choice.lower() == "y" or choice == "Y"):
                binumber = input("Enter a binary number that is 8 bits long  ")
                choiceloop = False
            elif(choice.lower() == "n" or choice == "N"):
                print("Okay goodbye!")
                choiceloop = False
                Repeat = False
            else:
                print("Invalid choice, type y or n.")

def Menu():
    Repeat = True
    while(Repeat==True):
        print("Menu: What would you like to convert?")
        choice = input("Denary to binary (DB) or Binary to Denary (BD) or exit (Q)? ")
        if(choice == "DB" or choice == "db"):
            DenToBi()
        elif(choice == "BD" or choice == "bd"):
            BiToDen()
        elif(choice == "Q" or choice.lower() == "q"):
            print("Have a nice day!")
            Repeat = False
        else:
            print("Invalid choice.")

Menu()
        