package day23_map_list_practice;

import java.util.*;

class Employee{
  String name;
  String department;

  Employee(String name,String department){
    this.name = name;
    this.department = department;
  }
}

public class Main {
  public static void main(String[] args) {
    
    List<Employee>employees = Arrays.asList(
      new Employee("田中", "営業"),
      new Employee("佐藤", "開発"),
      new Employee("鈴木", "営業"),
      new Employee("高橋", "開発"),
      new Employee("山田", "総務")
    );

    //部署
    Map<String,List<String>> result = new HashMap<>();

    for(Employee e : employees){

      //部署がない場合
      if(!result.containsKey(e.department)){
        result.put(e.department,new ArrayList<>());
      }

      //名前を追加
      result.get(e.department).add(e.name);
    }

    //出力
    for(String dept : result.keySet()){
      System.out.println(dept + ":" + result.get(dept));
    }
  }
}
