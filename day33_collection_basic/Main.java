package day33_collection_basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
  
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("Apple");
    list.add("Banana");
    list.add("Orange");

    System.out.println("=== List ===");

    for(String frult : list){
    System.out.println(frult);
  }

    System.out.println(list.get(1));

    Map<String,Integer> map = new HashMap<>();

    map.put("apple", 100);
    map.put("banana", 200);

    System.out.println("=== Map ===");

    System.out.println(map.get("banana"));

    System.out.println(map.containsKey("apple"));


    Set<String> set = new HashSet<>();

    set.add("A");
    set.add("B");
    set.add("A");

    System.out.println(("=== Set ==="));

    for(String s :set){
      System.out.println(s);
    }

    System.out.println(set.size());
  }
}
