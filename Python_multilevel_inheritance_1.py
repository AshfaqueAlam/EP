# Multilevel inheritance.

class c1:
    def display1(self):
        print("class c1")
class c2(c1):
    def display2(self):
        print("class c2")
class c3(c2):
    def display3(self):
        print("class c3")

s1=c3()
s1.display3()
s1.display2()
s1.display1()
