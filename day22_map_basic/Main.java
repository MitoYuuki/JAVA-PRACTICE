package day22_map_basic;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    
    Map<String, Integer> sales = new HashMap<>();

    //データ
    sales.put("りんご",100);
    sales.put("みかん",200);
    sales.put("りんご",150);

    //合計
    int total = 0;
    for (int price : sales.values()){
      total += price;
    }
    System.out.println("合計" + total);
  }
}
