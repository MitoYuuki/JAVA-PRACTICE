package day38_java_silver_class;

import java.util.ArrayList;
import java.util.List;

class User{

    String name;
    static int count = 0;

    public User(String name){
      this.name = name;
      count++;
    }

    public void showName(){
      System.out.println(this.name);
    }

    public static void showCount(){
      System.out.println(count);
    }

    public String hello(){
      return "Hello " + name;
    }

    public String hello(String message){
      return message + " " + name;
    }
  }

public class Main {

  public static void main(String[] args) {
    
    User user1 = new User("Tanaka");
    User user2 = new User("Sato");

    user1.showName();
    user2.showName();

    System.out.println(user1.hello());
    System.out.println(user2.hello("Good Morning"));

    User.showCount();

    List<String> list = new ArrayList<>();

    list.add("Java");
    list.add("silver");

    for(String s : list){
      System.out.println(s.toUpperCase());
    }
  }
}
