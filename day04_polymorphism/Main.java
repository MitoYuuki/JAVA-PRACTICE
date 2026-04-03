package day04_polymorphism;

public class Main {
  public static void main(String[] args) {
     User u1 = new User("山田");
     User u2 = new PremiumUser("佐藤");
     User u3 = new AdminUser("田中");

     User[] users = {u1, u2, u3};

    for (User u : users) {
      u.showInfo();
    }
  }
}
