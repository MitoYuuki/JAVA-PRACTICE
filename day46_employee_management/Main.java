package day46_employee_management;

import java.util.ArrayList;
import java.util.List;

class Employee {

  private String name;
  private int age;
  private int salary;

  public Employee(
    String name,
    int age,
    int salary
  ){

    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String getName(){

    return name;
  }

  public int getAge(){

    return age;
  }

  public int getSalary(){

    return salary;
  }

  public void setSalary(int salary){

    this.salary = salary;
  }

  public void showInfo(){

    System.out.println(
      name + " / " +
      age + "歳 / " +
      salary + "円"
    );
  }

  public boolean isAdult(){

    return age >= 20;
  }

  public static String upperText(
    String text
  ){

    return text.toUpperCase();
  }
}

public class Main {

  public static int getTotalSalary(
    List<Employee> list
  ){

    int sum = 0;

    for(Employee e : list){
      sum += e.getSalary();
    }

    return sum;
  }

  public static void main(String[] args) {

    List<Employee> employees =
      new ArrayList<>();

    employees.add(
      new Employee(
        "tanaka",
        25,
        300000
      )
    );

    employees.add(
      new Employee(
        "sato",
        18,
        220000
      )
    );

    employees.add(
      new Employee(
        "suzuki",
        30,
        400000
      )
    );

    for(Employee e : employees){

      e.showInfo();

      if(e.isAdult()){

        System.out.println(
          "ADULT"
        );

      } else {

        System.out.println(
          "NOT ADULT"
        );
      }

      if(
        e.getName()
         .contains("a")
      ){

        System.out.println(
          Employee.upperText(
            e.getName()
          )
        );
      }

      System.out.println("-----");
    }

    employees.get(0)
             .setSalary(350000);

    System.out.println(
      "TOTAL : " +
      getTotalSalary(employees)
    );
  }
}