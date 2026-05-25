package day47_order_management;

import java.util.ArrayList;
import java.util.List;

class Order {

  private String itemName;
  private int price;
  private boolean completed;

  public Order(
    String itemName,
    int price,
    boolean completed
  ){

    this.itemName = itemName;
    this.price = price;
    this.completed = completed;
  }

  public String getItemName(){

    return itemName;
  }

  public int getPrice(){

    return price;
  }

  public boolean isCompleted(){

    return completed;
  }

  public void showInfo(){

    System.out.println(
      itemName + " / " +
      price + "円"
    );
  }

  public static String upper(
    String text
  ){

    return text.toUpperCase();
  }
}

public class Main {

  public static int getTotalPrice(
    List<Order> list
  ){

    int sum = 0;

    for(Order o : list){

      if(!o.isCompleted()){
        continue;
      }

      sum += o.getPrice();
    }

    return sum;
  }

  public static void main(String[] args) {

    List<Order> orders =
      new ArrayList<>();

    orders.add(
      new Order(
        "java silver",
        2800,
        true
      )
    );

    orders.add(
      new Order(
        "docker",
        3500,
        false
      )
    );

    orders.add(
      new Order(
        "spring boot",
        4200,
        true
      )
    );

    for(Order o : orders){

      o.showInfo();

      if(o.isCompleted()){

        System.out.println(
          "COMPLETED"
        );

      } else {

        System.out.println(
          "WAITING"
        );
      }

      if(
        o.getItemName()
         .contains("java")
      ){

        System.out.println(
          Order.upper(
            o.getItemName()
          )
        );
      }

      System.out.println("-----");
    }

    System.out.println(
      "TOTAL : " +
      getTotalPrice(orders)
    );
  }
}