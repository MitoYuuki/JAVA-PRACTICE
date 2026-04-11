package day10_order_status;

public class Main {
  public static void main(String[] args) {
    
    Order order = new Order(1, OrderStatus.PENDING);

    System.out.println(order);

    order.nextStatus();
    System.out.println(order);

    order.nextStatus();
    System.out.println(order);

    order.nextStatus();
    System.out.println(order);
  }
}
