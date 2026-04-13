package day12_order_management;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    List<Order> orders = new ArrayList<>();

    orders.add(new Order("山田", 1000));
    orders.add(new Order("山田", 2000));
    orders.add(new Order("佐藤", 1500));
    orders.add(new Order("山田", 500));
    orders.add(new Order("佐藤", 700));

    //ユーザーごとの合計
    Map<String, Integer> totalMap = new HashMap<>();

    for (Order o : orders){
      String name = o.getUserName();
      int price = o.getPrice();

      //すでにある場合は加算
      if (totalMap.containsKey(name)){
        totalMap.put(name,totalMap.get(name) + price);
      } else {
        totalMap.put(name,price);
      }
    }

    //出力
    for(String name : totalMap.keySet()){
      System.out.println(name + "合計:" + totalMap.get(name));
    }
  }
}
