package day28_interview_list_string;

import java.util.ArrayList;
import java.util.List;

public class Main {
  
  public static List<String> checkLength(List<String> words) {
    
    List<String> result = new ArrayList<>();

      for(int i = 0; i < words.size(); i++){
        String word = words.get(i);

        if(word.length() >= 5){
          result.add(word.toUpperCase());
        }
    }
    return result;
  }

  public static void main(String[] args) {
    
    List<String> words = new ArrayList<>();

    words.add("apple");
    words.add("cat");
    words.add("banana");
    words.add("dog");

    List<String> result = checkLength(words);

    System.out.println(result);
  }
}
