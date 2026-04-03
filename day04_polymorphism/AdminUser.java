package day04_polymorphism;

public class AdminUser extends User {

  public AdminUser(String name){
    super(name);
  }
  
  @Override
  public String getRole(){
    return "管理者";
  }
}
