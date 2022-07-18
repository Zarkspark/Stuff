# Here we go!
leaderboard = open("Leaderboard.txt", "w") # This creates a file called Leaderboard.txt (The x part is for creating files)
uname = input("Type your username in!\n")
leaderboard.write("Made by: " + uname)
leaderboard.close()
