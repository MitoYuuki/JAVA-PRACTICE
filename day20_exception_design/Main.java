package day20_exception_design;

public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(1000);

    try{
      account.withdraw(500);
      account.withdraw(700);
    } catch(InsufficientBalanceException e){
      System.out.println(e.getMessage());
    }
  }
}
