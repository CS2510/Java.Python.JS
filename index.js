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

new Mammal()