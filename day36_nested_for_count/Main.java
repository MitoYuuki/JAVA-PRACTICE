package day36_nested_for_count;

public class Main {

  public static String cheak(String s){

    for(int i = 0; i < s.length(); i++){

      char c = s.charAt(i);

      int count = 0;

      for(int j = 0; j < s.length(); j++){

        if(c == s.charAt(j)){
          count++;
        }
      }

      if(count == 1){
        return String.valueOf(c);
      }
    }

    return "-1";
  }
  public static void main(String[] args) {
    
    String result = cheak("aab");
    System.out.println(result);
  }
}
