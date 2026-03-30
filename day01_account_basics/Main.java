package day01_account_basics;

public class Main {
  public static void main(String[] args) {
    
    Account a1 = new Account("12345", "山田太郎", 1000);
    Account a2 = new Account("12345", "山田太郎", 500);

    //toString()
    System.out.println(a1);

    //入金
    a1.deposit(500);
    System.out.println(a1.getBalance());

    //出金
    a1.withdraw(2000);
    System.out.println(a1.getBalance());

    //equals
    System.out.println(a1.equals(a2));
  }
}


