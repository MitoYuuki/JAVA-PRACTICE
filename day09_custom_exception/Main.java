package day09_custom_exception;

public class Main {
  public static void main(String[] args) {
    
    try{
      User u1 = new User("山田",20);
      System.out.println(u1);

      User u2 = new User("",-5);
      System.out.println(u2);

    }catch(CustomException e){
      System.out.println("エラー:" + e.getMessage());
    } 

    System.out.println("処理終了");
  }
}
