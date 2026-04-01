package day02_user;

public class Main {
  public static void main(String[] args) {
    User u1 = new User("山田太郎", "yamada@example.com", 20);
    User u2 = new User(null,null,15);

    //表示
    System.out.println(u1);
    System.out.println(u1.getemail());

    //成人判定
    System.out.println(u1.isAdult());
    System.out.println(u2.isAdult());
  }
}
