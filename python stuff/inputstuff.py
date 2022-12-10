import tkinter as tk


def submit():
    print("Username is: " + name.get())
# This function gets the input from the text box and prints it to the console.

window = tk.Tk()

window.geometry("200x100")
window.config(bg="black")
name = tk.Entry(bg="black", fg="white")
# Creates a text box for the user to type stuff into

button = tk.Button(text="submit", fg="green", bg="black", command=submit)
delete = tk.Button(text="Exit", fg="red", bg="black", command=window.destroy)
# Creates a button which when pressed, calls the submit() function

name.pack()
button.pack()
delete.pack()
# Packs all of the stuff together


window.mainloop()