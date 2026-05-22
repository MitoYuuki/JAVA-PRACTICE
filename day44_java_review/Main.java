package day44_java_review;

import java.util.ArrayList;
import java.util.List;

class Book {

  String title;
  int price;

  public Book(String title, int price){

    this.title = title;
    this.price = price;
  }

  public void showInfo(){

    System.out.println(
      title + " : " + price
    );
  }

  public boolean isExpensive(){

    return price >= 3000;
  }
}

public class Main {

  public static int getTotal(int[] numbers){

    int sum = 0;

    for(int i = 0; i < numbers.length; i++){
      sum += numbers[i];
    }

    return sum;
  }

  public static void main(String[] args) {

    int[] nums = {10, 20, 30};

    System.out.println(
      getTotal(nums)
    );

    List<Book> list =
      new ArrayList<>();

    list.add(
      new Book("Java", 2800)
    );

    list.add(
      new Book("Silver", 3500)
    );

    for(Book b : list){

      b.showInfo();

      if(b.isExpensive()){

        System.out.println(
          b.title.toUpperCase()
        );
      }
    }

    char rank = 'A';

    switch(rank){

      case 'A':
        System.out.println("Excellent");
        break;

      case 'B':
        System.out.println("Good");
        break;

      default:
        System.out.println("Unknown");
    }

    String text = null;

    System.out.println(text);
  }
}