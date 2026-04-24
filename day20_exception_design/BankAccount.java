package day20_exception_design;

public class BankAccount {
  private int balance;

  public BankAccount(int balance){
    this.balance = balance;
  }

  public void withdraw(int amount) throws InsufficientBalanceException{
    if (amount > balance){
      throw new InsufficientBalanceException("残高不足です");
    }
    balance = amount;
    System.out.println(amount + "円引き出しました");
  }
}
