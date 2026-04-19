package day16_optional_null_safety;

import java.util.Optional;

public class User {
  private String name;

  public User(String name){
    this.name = name;
  }

  public Optional<String>getName(){
    return Optional.ofNullable(name);
  }
}
