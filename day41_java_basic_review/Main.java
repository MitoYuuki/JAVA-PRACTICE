package day41_java_basic_review;

import java.util.ArrayList;
import java.util.List;

class Product {

  String name;
  int price;

  public Product(String name, int price){

    this.name = name;
    this.price = price;
  }

  public String getName(){

    return name;
  }

  public int getPrice(){

    return price;
  }

  public void showInfo(){

    System.out.println(name + " : " + price);
  }
}

public class Main {

  public static void main(String[] args) {

    List<Product> list = new ArrayList<>();

    list.add(new Product("Apple", 100));
    list.add(new Product("Banana", 200));
    list.add(new Product("Orange", 300));

    for(Product p : list){

      p.showInfo();

      if(p.getPrice() >= 200){
        System.out.println("High Price");
      }

      if(p.getName().contains("a") ||
         p.getName().contains("A")){

        System.out.println(
          p.getName().toUpperCase()
        );
      }
    }
  }
}