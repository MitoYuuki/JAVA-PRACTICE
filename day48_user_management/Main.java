package day48_user_management;

import java.util.ArrayList;
import java.util.List;

class User {

  private String name;
  private String email;
  private boolean active;

  public User(
    String name,
    String email,
    boolean active
  ){

    this.name = name;
    this.email = email;
    this.active = active;
  }

  public String getName(){

    return name;
  }

  public String getEmail(){

    return email;
  }

  public boolean isActive(){

    return active;
  }

  public void setEmail(
    String email
  ){

    this.email = email;
  }

  public void showInfo(){

    System.out.println(
      name + " / " + email
    );
  }

  public static String lower(
    String text
  ){

    return text.toLowerCase();
  }
}

public class Main {

  public static void main(String[] args) {

    List<User> users =
      new ArrayList<>();

    users.add(
      new User(
        "Tanaka",
        "TANAKA@test.com",
        true
      )
    );

    users.add(
      new User(
        "Sato",
        "SATO@test.com",
        false
      )
    );

    users.add(
      new User(
        "Suzuki",
        "SUZUKI@test.com",
        true
      )
    );

    for(User u : users){

      if(!u.isActive()){

        System.out.println(
          "INACTIVE USER"
        );

        break;
      }

      u.showInfo();

      System.out.println(
        User.lower(
          u.getEmail()
        )
      );

      if(
        u.getName()
         .contains("a")
      ){

        System.out.println(
          "NAME HAS a"
        );
      }

      System.out.println("-----");
    }

    users.get(0)
         .setEmail(
           "tanaka_new@test.com"
         );

    System.out.println(
      users.get(0).getEmail()
    );
  }
}
