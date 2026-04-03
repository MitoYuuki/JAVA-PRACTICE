package day04_polymorphism;

public class User {
  protected String name;

  public User(String name){
    this.name = name;
  }

  public String getRole(){
    return "一般ユーザー";
  }

  public void showInfo(){
    System.out.println("名前" + name + ", 権限" + getRole());
  }
}
