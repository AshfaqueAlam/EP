# Multiple inheritance

class Father:    # Base class.
    def display1(self):
        print("Father")


class Mother:    # Base class.
    def display2(self):
        print("Mother")


class Son(Father, Mother):    # Derived class.
    def display3(self):
        print("Son")


s1 = Son()
s1.display3()
s1.display2()
s1.display1()
