package day10_order_status;

public enum OrderStatus {
  PENDING("処理中"),
  SHIPPED("発送済み"),
  DELIVERED("配達完了"),
  CANSELED("キャンセル");

  private String label;

  OrderStatus(String label){
    this.label = label;
  }
  

  public String getLabel(){
    return label;
  }
}
