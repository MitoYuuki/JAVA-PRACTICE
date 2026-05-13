public class Main {

  public static String check(String s){

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

    System.out.println(check("aab"));
    System.out.println(check("abc"));
    System.out.println(check("ppp"));
  }
}