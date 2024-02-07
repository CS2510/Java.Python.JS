class Main{
  class Animal{
    Animal(){//Constructor
      System.out.println("You created an animal");
    }
  }
  
  class Mammal extends Animal{
    Mammal(){
      
    }
  }
  public static void main(String[] args){
    new Main();
  }

  Main(){
    new Mammal();
  }
}

