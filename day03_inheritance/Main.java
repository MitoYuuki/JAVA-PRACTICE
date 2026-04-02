package day03_inheritance;

public class Main {
  public static void main(String[] args) {
    
    User u1 = new User("山田太郎",20);
    PremiumUser u2 = new PremiumUser("佐藤花子", 25, 1000);

    //情報表示
    System.out.println(u1.getInfo());
    System.out.println(u2.getInfo());

    //権限確認
    System.out.println(u1.getRole());
    System.out.println(u2.getRole());
  }
}
