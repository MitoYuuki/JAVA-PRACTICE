package day06_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    
    //リスト作成
    List<User> users = new ArrayList<>();
    
    //追加
    users.add(new User("山田",20));
    users.add(new User("佐藤",25));
    users.add(new User("田中",17));

    //全件表示
    System.out.println("=== 全ユーザー ===");
    for(User u : users){
      System.out.println(u);
    }

    //条件で絞る（18歳以上）
    System.out.println("=== 成人ユーザー ===");
    for(User u : users){
      if(u.getAge() >= 18){
        System.out.println(u);
      }
    }

    //件数
    System.out.println("人数: "+ users.size());
  }
}
