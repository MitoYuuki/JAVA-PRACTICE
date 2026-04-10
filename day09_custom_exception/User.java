package day09_custom_exception;

public class User {
  
  private String name;
  private int age;

  public User(String name,int age) throws CustomException{
    if(name == null || name.isEmpty()){
      throw new CustomException("名前が不正です");
    }
    if (age < 0){
      throw new CustomException("年齢が不正です");
    }
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  @Override
  public String toString(){
    return "名前:" + name + "年齢:" + age;
  }
}
