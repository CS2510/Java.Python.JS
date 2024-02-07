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

  static class Something{
    static void sayHello(){
      System.out.println("Hello from a static class");
    }
  }

  Main(){
    new Mammal();
    Something.sayHello();
  }
}

