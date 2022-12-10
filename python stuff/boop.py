import tkinter as tk

window = tk.Tk()
# This initializes a window for you

greeting = tk.Label(text="Hello world!", width=25, height=10)
# This creates a message in the box and sets the text colour and more

greeting.pack()
# And this makes it show on the window

window.mainloop()
# This makes sure the window stays until it is closed

