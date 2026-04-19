package day16_optional_null_safety;

public class Main {
  public static void main(String[] args) {
    User user1 = new User("太郎");
    User user2 = new User(null);

    UserService service = new UserService();

    service.printUserName(user1);
    service.printUserName(user2);
  }
}
