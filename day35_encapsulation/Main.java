package day35_encapsulation;


class User{
  private int age;
  private String name;

  User(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    if(age >= 0){
      this.age = age;
    }
  }
}

public class Main {
  
  public static void main(String[] args) {
    
    User user = new User("Tanaka", 20);

    System.out.println(user.getName());

    System.out.println(user.getAge());

    user.setAge(30);

    System.out.println(user.getAge());
  }
}
