package day01_account_basics;

public class Account {
  private String accountNumber;
  private String ownerName;
  private int balance;

  //コンストラクタ
  public Account(String accoutNumber,String ownerName,int balance){
    this.accountNumber = accoutNumber;
    this.ownerName = ownerName;
    this.balance = balance;
  }

  // 入金
  public void deposit(int amount) {
    if (amount <= 0) {
      System.out.println("入金額が不正です");
      return;
    }
    this.balance += amount;
  }

    // 出金
    public boolean withdraw(int amount) {
      if (amount <= 0) {
        System.out.println("出金額が不正です");
        return false;
      }
      if (this.balance < amount) {
        System.out.println("残高不足です");
        return false;
      }
      this.balance -= amount;
      return true;
    }

  //残高取得(getter)
  public int getBalance(){
    return this.balance;
  }

  //口座情報表示
  @Override
  public String toString(){
    return "口座番号" + accountNumber + ", 名義:" + ownerName + ", 残高:" + balance;
  }

  //口座番号で比較
  @Override
  public boolean equals(Object o){
    if(this ==o) return true;

    if(o instanceof Account){
      Account a = (Account) o;
      return this.accountNumber.equals(a.accountNumber);
    }
    return false;
  }
}
