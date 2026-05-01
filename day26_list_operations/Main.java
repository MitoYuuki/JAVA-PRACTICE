package day26_list_operations;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    
    List<String>list = new ArrayList<>();

    //追加
    list.add("A");
    list.add("B");
    list.add("C");

    //追加(位置指定)
    list.add(1,"X");

    //表示
    System.out.println("初期: " + list);

    //削除
    list.remove("B");

    //存在チェック
    System.out.println("Cある？: " + list.contains("C"));

    //位置取得
    System.out.println("Aの位置: " + list.indexOf("A"));

    //最終結果
    System.out.println("最終: " + list);

  }
}
