package day49_business_style_with_comment;

import java.util.ArrayList;
import java.util.List;

/*
 * 商品クラス
 * 商品名・価格・在庫状態を管理する
 */
class Product {

  // 商品名
  private String name;

  // 価格
  private int price;

  // 在庫有無
  private boolean stock;

  /*
   * コンストラクタ
   * 商品情報を初期化
   */
  public Product(
    String name,
    int price,
    boolean stock
  ){

    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  // 商品名取得
  public String getName(){
    return name;
  }

  // 価格取得
  public int getPrice(){
    return price;
  }

  // 在庫確認
  public boolean hasStock(){
    return stock;
  }

  // 商品情報表示
  public void showInfo(){

    System.out.println(
      "商品名 : " + name
    );

    System.out.println(
      "価格 : " + price + "円"
    );
  }
}

public class Main {

  /*
   * 在庫あり商品の
   * 合計金額を計算
   */
  public static int getTotalPrice(
    List<Product> products
  ){

    int sum = 0;

    // 商品を1件ずつ取り出す
    for(Product p : products){

      // 在庫なしはスキップ
      if(!p.hasStock()){
        continue;
      }

      sum += p.getPrice();
    }

    return sum;
  }

  public static void main(String[] args) {

    // 商品一覧
    List<Product> products =
      new ArrayList<>();

    // 商品追加
    products.add(
      new Product(
        "Java Silver",
        2800,
        true
      )
    );

    products.add(
      new Product(
        "Spring Boot",
        3500,
        false
      )
    );

    products.add(
      new Product(
        "Docker",
        4200,
        true
      )
    );

    // 商品情報表示
    for(Product p : products){

      p.showInfo();

      // 在庫確認
      if(p.hasStock()){

        System.out.println(
          "在庫あり"
        );

      } else {

        System.out.println(
          "在庫なし"
        );
      }

      // Java関連商品チェック
      if(
        p.getName()
         .toLowerCase()
         .contains("java")
      ){

        System.out.println(
          "Java関連商品です"
        );
      }

      System.out.println("-----");
    }

    // 合計金額表示
    int total =
      getTotalPrice(products);

    System.out.println(
      "合計金額 : " + total + "円"
    );
  }
}
