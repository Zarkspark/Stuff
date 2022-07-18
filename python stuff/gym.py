# This program is a thing for a gym
amount = int(input("How many people will there be? "))
for i in range(amount):
    op = input("Do you they have their gym card? (y/n)")
    if(op == "y"):
        access = True
    elif(op == "n"):
        access = False
    else:
        print("Type in y or n next time.")
    maxcap = 10
    currentcap = 0
    if access == True:
        print("Access granted.")
        currentcap = currentcap+1
    else:
        print("Access denied.")

    if(currentcap > maxcap):
        access = False
        print("Maximum capacity reached. Access denied")
    elif(currentcap == maxcap):
        access = True
        print("Maximum capacity has been reached. No more people will be allowed in.")
    
