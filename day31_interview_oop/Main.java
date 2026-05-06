package day31_interview_oop;

class Animal{

  protected String name;

  Animal(String name){
    this.name = name;
  }

  public void sound(){
    System.out.println("Animal sound");
  }

  @Override
  public String toString(){
    return "名前 :" + name;
  }
}

class Dog extends Animal{

  private int age;

  Dog(String name, int age){
    super(name);

    this.age = age;
  }

  @Override
  public void sound(){
    System.out.println("wan");
  }

  @Override
  public String toString(){
    return super.toString() + "年齢 :" + age;
  }
}

public class Main {

  public static void main(String[] args) {
    
    Dog dog = new Dog("Pochi",1);

    dog.sound();

    System.out.println(dog);
  } 
}
