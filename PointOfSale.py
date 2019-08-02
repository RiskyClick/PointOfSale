from tkinter import *

master = Tk()

def food():
    print('You made it to food')

def bev():
    print('You made it to bev')

def back():
    print('You made it to back')

def callback():
    fbb = Tk()
    fod = Button(fbb, text = "FOOD", command=food)
    beva = Button(fbb, text = "BEV", command=bev)
    bac = Button(fbb, text = "BACK", command=back)
    fod.pack()
    beva.pack()
    bac.pack()
    print ("click!")

b = Button(master, text="OK", command=callback)
b.pack()

mainloop()
