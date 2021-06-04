# Multiple inheritance.

class A:    # Base class
    def x(self):
        print("Method of A")


class B:    # Base class
    def x(self):
        print("Method of B")


class C(A, B):    # Subclass of A,B. C inherits properties of both the classes A & B
    pass


y = C()
B.x(y)
A.x(y)
