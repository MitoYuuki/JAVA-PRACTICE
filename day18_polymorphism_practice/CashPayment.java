package day18_polymorphism_practice;

public class CashPayment extends Payment{
  
  @Override
  public void pay(int amount){
    System.out.println("現金で" + amount + "円支払い");
  }
}
