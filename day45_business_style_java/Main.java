package day45_business_style_java;

import java.util.ArrayList;
import java.util.List;

class Product {

  private String name;
  private int price;
  private boolean stock;

  public Product(
    String name,
    int price,
    boolean stock
  ){

    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  public String getName(){

    return name;
  }

  public int getPrice(){

    return price;
  }

  public boolean hasStock(){

    return stock;
  }

  public void showInfo(){

    System.out.println(
      name + " : " +
      price + "円"
    );
  }
}

public class Main {

  public static int getTotalPrice(
    List<Product> list
  ){

    int sum = 0;

    for(Product p : list){

      if(p.hasStock()){
        sum += p.getPrice();
      }
    }

    return sum;
  }

  public static void main(String[] args) {

    List<Product> products =
      new ArrayList<>();

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

    for(Product p : products){

      p.showInfo();

      if(p.hasStock()){

        System.out.println(
          "IN STOCK"
        );

      } else {

        System.out.println(
          "NO STOCK"
        );
      }

      if(
        p.getName()
         .toLowerCase()
         .contains("java")
      ){

        System.out.println(
          "JAVA BOOK"
        );
      }

      System.out.println("------");
    }

    int total =
      getTotalPrice(products);

    System.out.println(
      "TOTAL : " + total
    );
  }
}