package day40_java_review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {

  String name;
  int age;

  public User(String name, int age){

    this.name = name;
    this.age = age;
  }

  public void showInfo(){

    System.out.println(name);
    System.out.println(age);
  }

  public boolean isAdult(){

    return age >= 20;
  }
}

public class Main {

  public static int sum(int[] numbers){

    int sum = 0;

    for(int i = 0; i < numbers.length; i++){
      sum += numbers[i];
    }

    return sum;
  }

  public static void main(String[] args) {

    User user = new User("Tanaka", 22);

    user.showInfo();

    if(user.isAdult()){
      System.out.println("Adult");
    } else {
      System.out.println("Child");
    }

    String text = "java silver";

    System.out.println(text.toUpperCase());
    System.out.println(text.replace("java", "JAVA"));

    int[] numbers = {10, 20, 30};

    System.out.println(sum(numbers));

    List<String> list = new ArrayList<>();

    list.add("apple");
    list.add("banana");
    list.add("orange");

    for(String str : list){

      if(str.contains("a")){
        System.out.println(str);
      }
    }

    Map<String, Integer> map = new HashMap<>();

    map.put("apple", 100);
    map.put("banana", 200);

    for(String key : map.keySet()){

      System.out.println(key);
      System.out.println(map.get(key));
    }
  }
}