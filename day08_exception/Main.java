package day08_exception;

public class Main {
  public static void main(String[] args) {
    
    String[] data = {"10","20","abc","30"};

    for (String s : data){
      try{
        int num = Integer.parseInt(s);
        System.out.println("数値:" + num);
      } catch(NumberFormatException e){
        System.out.println("変換エラー:" + s);
      }
    }
    System.out.println("処理完了");
  }
}
