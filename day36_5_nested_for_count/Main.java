import java.util.HashMap;
import java.util.Map;

public class Main {

  public static String cheak(String s){

    Map<Character,Integer> map = new HashMap<>();

    for(int i = 0; i < s.length(); i++){

      char c = s.charAt(i);

      map.put(c, map.getOrDefault(c,0) + 1);
    }

    for(int i = 0; i < s.length(); i++){

      char c = s.charAt(i);

      if(map.get(c) == 1){
        return String.valueOf(c);
      }
    }

    return "-1";
  }

  public static void main(String[] args) {
    
    System.out.println(cheak("aab"));
  }
}
