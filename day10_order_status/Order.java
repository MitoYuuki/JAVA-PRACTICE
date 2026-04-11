package day10_order_status;

public class Order {
  private int id;
  private OrderStatus status;

  public Order(int id,OrderStatus status){
    this.id = id;
    this.status = status;
  }

  public OrderStatus getStatus(){
    return status;
  }

  public void nextStatus(){
    switch (status){
      case PENDING:
        status = OrderStatus.SHIPPED;
        break;
      case SHIPPED:
        status = OrderStatus.DELIVERED;
        break;
      case DELIVERED:
        System.out.println("すでに配達完了です");
        break;
      case CANSELED:
        System.out.println("キャンセル済みです");
        break;
    }
  }
  @Override
  public String toString(){
    return "注文ID:" + id + ", 状態:" + status.getLabel();
  }
}
