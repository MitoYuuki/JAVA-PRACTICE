package day07_map;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    
    //Map作成(ID = User)
    Map<Integer,User> userMap = new HashMap<>();

    //追加
    userMap.put(1,new User("山田", 20));
    userMap.put(2,new User("佐藤", 25));
    userMap.put(3,new User("田中", 17));

    //全権表示
    System.out.println("=== ID=3のユーザー ===");
    System.out.println(userMap.get(3));

    //存在チェック
    if (userMap.containsKey(3)){
      System.out.println("ID4あり");
    }
    else{
        System.out.println(("ID4なし"));
    }
  }
}
