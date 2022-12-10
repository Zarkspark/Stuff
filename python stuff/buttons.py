import tkinter as tk

window = tk.Tk()

message = tk.Label(text="Press the button!")
button = tk.Button(text="Press me!", width=25, height = 10, bg="red")
message.pack()
button.pack()
# You can initialize a button the same way you initialize a Label

window.mainloop()