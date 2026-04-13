package day11_test_practice;

public class Main {
  public static void main(String[] args) {
    
    int[] numbers = {1,2,3,4,5};

    //合計
    int result = Calculator.sum(numbers);

    //加工
    String output = StringProcessor.process(result);

    //出力
    System.out.println(output);
  }
}
