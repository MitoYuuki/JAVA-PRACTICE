package day11_test_practice;

public class Calculator {
  public static int sum(int [] numbers){
    int total = 0;

    for(int n : numbers){
      total += n;
    }

    return total;
  }
}
