package day25_map_computeIfAbsent;

import java.util.*;

class Employee{
  String name;
  String depatrment;

  Employee(String name, String department){
    this.name = name;
    this.depatrment = department;
  }
}

public class Main {
  public static void main(String[] args) {
    
    List<Employee> employees = Arrays.asList(
      new Employee(("田中"), "営業"),
      new Employee(("佐藤"), "開発"),
      new Employee(("鈴木"), "営業"),
      new Employee(("高橋"), "開発"),
      new Employee(("山田"), "総務")
    );

    Map<String,List<String>> result = new HashMap<>();

    for (Employee e : employees){
      result
            .computeIfAbsent(e.depatrment, k -> new ArrayList<>())
            .add(e.name);
    }

    result.forEach((dept,names) ->
      System.out.println(dept + ":" + names)
    );
  }
}
