package day18_polymorphism_practice;

public class CreditCardPayment extends Payment {

  @Override
  public void pay(int amount){
    System.out.println("クレジットカードで" + amount + "円支払い");
  }
}
