package day42_java_total_review;

class Student {

  String name;
  int[] scores;

  public Student(String name, int[] scores){

    this.name = name;
    this.scores = scores;
  }

  public int getTotal(){

    int sum = 0;

    for(int i = 0; i < scores.length; i++){
      sum += scores[i];
    }

    return sum;
  }

  public double getAverage(){

    return (double)getTotal() / scores.length;
  }

  public void showInfo(){

    System.out.println("NAME : " + name);

    System.out.println(
      "UPPER : " + name.toUpperCase()
    );

    System.out.println(
      "TOTAL : " + getTotal()
    );

    System.out.println(
      "AVERAGE : " + getAverage()
    );
  }

  public static boolean isPass(double average){

    return average >= 60;
  }
}

public class Main {

  public static void main(String[] args) {

    int[] scores = {70, 80, 50};

    Student student =
      new Student("tanaka", scores);

    student.showInfo();

    if(Student.isPass(
      student.getAverage())){

      System.out.println("PASS");

    } else {

      System.out.println("FAIL");
    }
  }
}