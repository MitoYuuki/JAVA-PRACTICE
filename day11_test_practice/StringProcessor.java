package day11_test_practice;

public class StringProcessor {

  public static String process(int result){
    String text = String.valueOf(result);

    if (text.contains("1")){
      return text + "☆";
    }

    return text;
  }
}
