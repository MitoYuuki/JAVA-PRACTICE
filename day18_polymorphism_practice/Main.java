package day18_polymorphism_practice;

public class Main {
  public static void main(String[] args) {
     Payment p1 = new CreditCardPayment();
     Payment p2 = new CashPayment();

     p1.pay(1000);
     p2.pay(1000);
  }
}
