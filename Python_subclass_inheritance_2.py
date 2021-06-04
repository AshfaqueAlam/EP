# Single inheritance using constructor.

class vehicle:    # Parent class.
    def __init__(self,name,price):
        self.name=name
        self.price=price
    def display(self):
        print("Name: ",self.name)
class category(vehicle):    # Derived class / subclass.
    def __init__(self,name,price):
        vehicle.__init__(self,name,price)    # Pass data to base constructor.
    def disp_price(self):
        print("Price: ",self.price)
car1=category("Audi",4000000)
car1.display()
car1.disp_price()
car2=category("BMW",6000000)
car2.display()
car2.disp_price()
