package day16_optional_null_safety;

import java.util.Optional;

public class UserService {
  
  public void printUserName(User user){
    Optional<String> name = user.getName();

    if(name.isPresent()){
      System.out.println(name.get());
    }else{
      System.out.println("名前がありません");
    }
  }
}
