# Multilevel inheritance.

class Grandfather:
    grandfathername = ""

    def grandfather(self):
        print(self.grandfathername)


class Father(Grandfather):    # Intermediate class.
    fathername = ""

    def father(self):
        print(self.fathername)


class Son(Father):    # Derived Class.
    def parent(self):
        print("GrandFather: ", self.grandfathername)
        print("Father: ", self.fathername)


# Driver code.
s1 = Son()
s1.grandfathername = "XYZ"
s1.fathername = "ABC"
s1.parent()
