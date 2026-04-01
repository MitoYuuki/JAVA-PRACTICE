package day02_user;

public class User {
  private String name;
  private String email;
  private int age;

  //コンストラクタ
  public User(String name,String email,int age){
    this.name = name;
    this.email = email;
    this.age = age;
  }

  //名前取得(null対策)
  public String getname(){
    return (this.name != null) ? this.name : "未設定";
  }

  //メール取得(null対策)
  public String getemail(){
    return (this.email != null) ? this.email : "未設定";
  }

  //年齢チェック
  public boolean isAdult(){
    return this.age >= 18;
  }

  //表示
  @Override
  public String toString(){
    String status = isAdult() ? "成人" : "未成年";
    return "名前:" + getname() + ", メール:" + getemail() + ", 年齢:" + age + ", 状態:" + status; 
  }
}


