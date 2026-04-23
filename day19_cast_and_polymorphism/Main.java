package day19_cast_and_polymorphism;

class Animal {
  public void speak(){
    System.out.println("動物が鳴く");
  }
}

class Dog extends Animal{
  @Override
  public void speak(){
    System.out.println("ワン!");
  }

  public void run(){
    System.out.println("犬が走る");
  }
}

class Cat extends Animal{
  @Override
  public void speak(){
    System.out.println("にゃー!");
  }

  public void jump(){
    System.out.println("猫がジャンプ");
  }
}

public class Main {
  public static void main(String[] args) {
    

    //アップキャスト
    Animal a1 = new Dog();
    Animal a2 = new Cat();

    a1.speak();
    a2.speak();

    //ダウンキャスト
    if (a1 instanceof Dog){
      Dog d = (Dog) a1;
      d.run();
    }

    if (a2 instanceof Cat){
      Cat c = (Cat) a2;
      c.jump();
    }
  }
}
