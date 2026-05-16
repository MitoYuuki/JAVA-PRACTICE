package day39_java_silver_review;

import java.util.ArrayList;
import java.util.List;

class User {

  String name;

  public User(){
    this.name = "NO NAME";
  }

  public User(String name){
    this.name = name;
  }

  public void hello(){
    System.out.println("Hello");
  }

  public void hello(String message){
    System.out.println(message + " " + name);
  }

  public void showName(){
    System.out.println(name);
  }
}

public class Main {

  public static void main(String[] args) {

    User user1 = new User();
    User user2 = new User("Tanaka");

    user1.showName();
    user2.showName();

    user1.hello();
    user2.hello("Good Morning");

    for(int i = 1; i <= 5; i++){

      if(i == 3){
        continue;
      }

      if(i == 5){
        break;
      }

      System.out.println(i);
    }

    char grade = 'A';

    switch(grade){

      case 'A':
        System.out.println("Excellent");
        break;

      case 'B':
        System.out.println("Good");
        break;

      default:
        System.out.println("Unknown");
    }

    String s = null;

    System.out.println(s);

    List<String> list = new ArrayList<>();

    list.add("java");
    list.add("silver");
    list.add("gold");

    for(String str : list){
      System.out.println(str.toUpperCase());
    }
  }
}