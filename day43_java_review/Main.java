package day43_java_review;

import java.util.HashMap;
import java.util.Map;

class Employee {

  String name;
  int salary;

  public Employee(String name, int salary){

    this.name = name;
    this.salary = salary;
  }

  public void showInfo(){

    System.out.println(
      name + " : " + salary
    );
  }

  public boolean isHighSalary(){

    return salary >= 300000;
  }

  public static String upper(String text){

    return text.toUpperCase();
  }
}

public class Main {

  public static void main(String[] args) {

    Map<String, Integer> map =
      new HashMap<>();

    map.put("Java", 90);
    map.put("Silver", 80);
    map.put("Gold", 70);

    for(String key : map.keySet()){

      int value = map.get(key);

      if(value == 80){
        continue;
      }

      if(value == 70){
        break;
      }

      System.out.println(key);
      System.out.println(value);
    }

    Employee emp =
      new Employee("tanaka", 350000);

    emp.showInfo();

    if(emp.isHighSalary()){

      System.out.println(
        Employee.upper("high salary")
      );

    } else {

      System.out.println("normal");
    }
  }
}
