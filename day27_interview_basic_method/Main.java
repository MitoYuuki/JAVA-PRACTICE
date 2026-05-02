package day27_interview_basic_method;

public class Main {
  
  public static String creatingMessage(String name){

    //文字列操作
    String upper = name.toUpperCase();

    //返り値
    return "Hello" + upper;
  }

  public static void main(String[] args) {
    
    //メソッド呼び出し
    String result = creatingMessage("taro");

    System.out.println(result);
  }
}
