# Single inheritance without using constructor.

class vehicle:    # Parent class
    name = 'BMW'

    def display(self):
        print("Name: ", self.name)


class category(vehicle):    # Derived class / subclass.
    price = 4000000

    def disp_price(self):
        print("Price: ", self.price)


car1 = category()
car1.display()
car1.disp_price()
