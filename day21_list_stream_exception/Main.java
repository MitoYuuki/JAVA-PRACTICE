package day21_list_stream_exception;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    
    List<String> data = Arrays.asList("10","20","abc","30");

    List<Integer> result = data.stream()
    .map(str -> {
      try{
        return Integer.parseInt(str);
      } catch (NumberFormatException e){
        return null;
      }
    })
    .filter(n -> n != null)
    .map(n -> n * 2)
    .collect(Collectors.toList());

    System.out.println(result);
  }
}
