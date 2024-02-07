class Animal:
  def __init__(self):#constructor
    print("You created an animal")
  
class Mammal(Animal):
  def __init__(self):
    super().__init__()
  
m = Mammal()
