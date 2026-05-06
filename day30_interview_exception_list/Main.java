package day30_interview_exception_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static int sum(List<Integer> numbers){
    int sum = 0;

    for(int i = 0; i < numbers.size(); i++){
      sum += numbers.get(i);
    }

    return sum;
  }

  public static double average(List<Integer> numbers){
    if(numbers.size() == 0){
      throw new IllegalArgumentException("リストが空です");
    }
    int total = sum(numbers);

    return(double) total/numbers.size();
  }

  public static void main(String[] args) {
    List<Integer>numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    int result = sum(numbers);

    double avg = average(numbers);

    System.out.println(result);
    System.out.println(avg);
  }
}