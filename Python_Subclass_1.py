# ? Tutorial: https://youtu.be/RSl87lqOXDE

# * Python Program on Subclass :-



# Define a parent class Person.
class Person(object):    # `object` written b/w () means. Class will take argument.
    "returns a Person object with given name"    # Or you can use ' ' as well. Its called `String Literals`.
    # https://docs.python.org/2.0/ref/strings.html#:~:text=In%20plain%20English.
    # Any constant string is known as `String Literal`. Also, it can be assigned to a variable, eg., a='This is string literal.'
    # It can be used for `docstring` as well. Usually """ """ used for docstring.

    def get_name(self, name):
        self.name = name        # RHS `name` provided by user as argument to the function. Which is assigned to another variable called `name` and is accessed by the `self` keyword.

    def get_details(self):      # No argument will be passed while callig it.
        "returns a string containing name of person"
        return self.name


# Define a subclass Student. (So we can access the functions or methods of parent class alongwith we can add new functionality in our subclass without affecting the parent class.)
# Instead of copying the code over and over in every subclass we can just inherit in it and use that parent class methods over and over again.

class Student(Person):    # When calling a subclass. 1st it will look into the subclass content then it will look into the parent class then it search for builtin objects. EVERY CALSS IS INHERITED FROM THIS BUILTIN OBJECT CLASS.
    "return a Student object, takes 3 arguments"

    def fill_details(self, name, branch, year):
        # Person.get_name(self, name)    # Instead of copying and pasting the logic of `get_details` from parent class. Just write-> Parent_class_name.method_name(self,argument1,argument2,...) and the method of parent class will take care of it.
                                         # For constructor use ->  Parent_class_name.__init__(self,argument1,argument2,...)
        # or,
        super().get_name(name)           # For constructor use ->  super().__init__(self,argument1,argument2,...)
        # or,
        # self.get_name(name)
        self.branch = branch             # Here we're defining variables specially for this `Student` subclass. No affect/changes on parent class `Person`. Remember, subclass inherits methods or functions of parent class along with that it has their own methods or functions and variables.
        self.year = year

    def get_details(self):
        "returns student details"
        print("Name:", self.name)        # Will be calculated in parent class method then returned to this subclass [see above line 24].
        print("Branch:", self.branch)
        print("Year:", self.year)


# Define a sublcass Teacher.
class Teacher(Person):
    "returns a Teacher object, takes 2 arguments"

    def fill_details(self, name, branch):
        Person.get_name(self, name)
        self.branch = branch

    def get_details(self):
        print("Name:", self.name)
        print("Branch:", self.branch)


# Define one object/instance for each class.
person1 = Person()
student1 = Student()
teacher1 = Teacher()

# Fill details in the objects. Calling those functions with actual arguments.
person1.get_name("Lara")        # Since, `get_name` attached to an object its called as `fields`.
student1.fill_details("Elsa", "CSE", 2003)
teacher1.fill_details("Tifa", "ECE")

# Print the details using parent class function.
print(person1.get_details())    # `get_details` in the Class `Person` will return `self.name`. So it will be, print(self.name) = Lara
print(student1.get_details())
print(teacher1.get_details())



print() # -------------------------------------------------------------------------------

# NOTE:- Python has a builtin function called `isinstance()`. It will tell us if an object is an instance of a class.
# eg.,
print(isinstance(student1,Student))    # Whether `student1` is an instance of `Student` class.
print(isinstance(student1,Person))     # `student1` is also a subclass of `Person`. So, its also an instance of the class `Person`.
print(isinstance(student1,Teacher))    # `student1` is not an instance of `Teacher`. So, it returns FALSE.

print()

# `issubclass()` is used to tell if a class is a subclass of another.
# eg.,
print(issubclass(Student,Person))    # Is `Student` subclass of `Person`. TRUE
print(issubclass(Student,Teacher))   # Is `Student` subclass of `Teacher`. FALSE
