class Animal:
  def __init__(self):#constructor
    print("You created an animal")
  
class Mammal(Animal):
  def __init__(self):
    super().__init__()
    
class Something:
  @staticmethod
  def say_hello():
    print("Hello from a static class")
  
  
m = Mammal()
Something.say_hello()
