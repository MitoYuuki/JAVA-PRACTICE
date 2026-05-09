package day34_static_instance;


class User{

  static int count = 0;

  private String name;

  User(String name){
    this.name = name;

    count++;
  }

  public void showname(){
    System.out.println(name);
  }

  public static void showCount(){
    System.out.println("count :" + count);
  }
}

public class Main {
  
  public static void main(String[] args) {
    
    User u1 = new User("Tanaka");
    User u2 = new User("Suzuki");

    u1.showname();
    u2.showname();

    User.showCount();
  }
}
