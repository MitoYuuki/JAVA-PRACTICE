package day29_interview_array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
  
  public static List<Integer> over60(int[] scores){

    List<Integer> result = new ArrayList<>();

    for(int i = 0; i < scores.length; i++){

      if(scores[i] >= 60){
        result.add(scores[i]);
      }
    }
    return result;
  }

  // 平均値を返す
  public static double average(int[] scores) {
    
    int sum = 0;

    for(int i = 0; i < scores.length; i++){
      sum += scores[i];
    }
    return(double)sum / scores.length;
  }

  public static void main(String[] args) {
    

    int[] scores = {30,80,100,50,70};

    List<Integer> result = over60(scores);

    double avg = average(scores);

    System.out.println(result);
    System.out.println(avg);
  }
}
