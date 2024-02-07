class Animal{
  constructor(){
    console.log("You created an animal")
  }
}

class Mammal extends Animal{
  constructor(){
    super()
  }
}

class Something{
  static sayHello(){
    console.log("Hello from a static class")
  }
}

new Mammal()
Something.sayHello()