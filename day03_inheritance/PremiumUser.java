package day03_inheritance;

public class PremiumUser extends User {
  private int points;

  //コンストラクタ
  public PremiumUser(String name,int age, int points){
    super(name, age);
    this.points = points;
  }

  //ポイント取得
  public int getPoints(){
    return this.points;
  }

  //オーバーライド
  @Override
  public String getRole(){
    return "有料ユーザー";
  }

  //表示を拡張
  @Override
  public String getInfo(){
    return super.getInfo() + ",ポイント:" + points;
  }
}
