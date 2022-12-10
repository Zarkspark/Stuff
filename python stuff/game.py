import tkinter as tk
import random

def difficulty():
    window.geometry("300x300")
    window.title("Multiplication Game")
    start_button.pack_forget()
    start_label.pack_forget()
    # This thing just makes the button disappear
    intro = tk.Label(start_frame,text="Please pick a difficulty:")
    easy = tk.Button(start_frame,text="Easy",command=e)
    medium = tk.Button(start_frame,text="Medium",command=m)
    hard = tk.Button(start_frame,text="Hard",command=h)
    intro.pack()
    easy.pack()
    medium.pack()
    hard.pack()

def e():
    identifier = "easy"
    start_frame.destroy()
    game_frame.pack()
    num1 = random.randint(0,10)
    num2 = random.randint(0,10)
    question = tk.Label(game_frame,text="What is " + str(num1) + " x " + str(num2) + "?")
    question.pack()
    answer_box = tk.Entry(game_frame)
    submit = tk.Button(game_frame,text="Submit",command=lambda: check(identifier,submit,question,answer_box,num1,num2))
    # I'm not even gonna try and understand why I used lambda here but it works so horay. That's not even how you spell hooray.
    answer_box.pack()
    submit.pack()

def m():
    identifier = "medium"
    start_frame.destroy()
    game_frame.pack()
    num1 = random.randint(0,100)
    num2 = random.randint(0,100)
    question = tk.Label(game_frame,text="What is " + str(num1) + " x " + str(num2) + "?")
    question.pack()
    answer_box = tk.Entry(game_frame)
    submit = tk.Button(game_frame,text="Submit",command=lambda: check(identifier,submit,question,answer_box,num1,num2))
    # I'm not even gonna try and understand why I used lambda here but it works so horay. That's not even how you spell hooray.
    answer_box.pack()
    submit.pack()

def h():
    identifier = "hard"
    start_frame.destroy()
    game_frame.pack()
    num1 = random.randint(0,1000)
    num2 = random.randint(0,1000)
    question = tk.Label(game_frame,text="What is " + str(num1) + " x " + str(num2) + "?")
    question.pack()
    answer_box = tk.Entry(game_frame)
    submit = tk.Button(game_frame,text="Submit",command=lambda: check(identifier,submit,question,answer_box,num1,num2))
    # I'm not even gonna try and understand why I used lambda here but it works so horay. That's not even how you spell hooray.
    answer_box.pack()
    submit.pack()


def check(identifier,submit,question,answer_box, num1, num2):
    score = 0
    score_show = tk.Label(game_frame,text="Score: " + str(score))
    answer = answer_box.get()
    if(answer.isdigit()):
        if(int(answer) == num1*num2):
            submit.pack_forget()
            question.pack_forget()
            answer_box.pack_forget()
            if(identifier == "easy"):
                print("Correct")
                score = score+1
                e()
            elif(identifier == "medium"):
                print("Correct")
                score = score+1
                m()
            else:
                print("Correct")
                score = score+1
                h()
        else:
            print("Incorrect")
            score= score-1
    else:
        print("NAN")
        score = score-1
    
window = tk.Tk()
window.geometry("200x200")
start_frame = tk.Frame()
game_frame = tk.Frame()
start_label = tk.Label(text="This is a multiplication game!")
start_button = tk.Button(text="Start", command=difficulty)
start_label.pack()
start_button.pack()
start_frame.pack()
window.mainloop()