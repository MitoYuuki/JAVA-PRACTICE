package day32_interface_abstract;

interface Animal{
  void sound();
}

abstract class Dog implements Animal{
  protected String name;

  Dog(String name){
    this.name = name;
  }

  public void sleep(){
    System.out.println(name + "is sleeping");
  }
}

class Poodle extends Dog{

  Poodle(String name){
    super(name);
  }

  @Override
  public void sound(){
    System.out.println(name + ": wan");
  }
}

public class Main {
  
  public static void main(String[] args) {
    
    Animal a = new Poodle(("Pochi"));
    a.sound();
    Poodle p = new Poodle("Moko");
    p.sleep();
  }
}
