package day12_order_management;

public class Order {
  private String userName;
  private int price;

  public Order(String useName, int price){
    this.userName = useName;
    this.price = price;
  }

  public String getUserName(){
    return userName;
  }

  public int getPrice(){
    return price;
  }
}
