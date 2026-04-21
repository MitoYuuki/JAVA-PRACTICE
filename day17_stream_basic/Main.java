package day17_stream_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product{
  String name;
  int price;

  Product(String name, int price){
    this.name = name;
    this.price = price;
  }
}

public class Main {
  public static void main(String[] args) {
    
    List<Product> products = Arrays.asList(
      new Product("りんご",500),
      new Product("みかん",1200),
      new Product("バナナ",1500)
    );

    List<String> reList = products.stream()
      .filter(p -> p.price >= 1500)
      .map(p -> "★" + p.name)
      .collect(Collectors.toList());

    for(String name : reList){
      System.out.println(name);
    }
  }
}
