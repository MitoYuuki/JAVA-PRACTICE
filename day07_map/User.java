package day07_map;

public class User {
  private String name;
  private int age;

  public User(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  @Override
  public String toString(){
    return "名前:" + name + ", 年齢:" + age;
  }
}
