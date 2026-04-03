package day04_polymorphism;

public class PremiumUser extends User{

  public PremiumUser(String name) {
    super(name);
  }

  @Override
  public String getRole(){
    return "有料ユーザー";
  }
}
