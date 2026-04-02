package day03_inheritance;

public class User {
  protected String name;
  protected int age;

  //コンストラクタ
  public User(String name,int age){
    this.name = name;
    this.age = age;
  }

  //表示
  public String getInfo(){
    return "名前:" + name + ",年齢:"+ age;
  }

  //権限
  public String getRole(){
    return "一般ユーザー";
  }
}
