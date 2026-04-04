package day05_logger;

public class Logger {
  
  private StringBuilder log;

  //コンストラクタ
  public Logger(){
    this.log = new StringBuilder();
  }

  //ログ確認
  public void appendLog(String message){
    log.append("[LOG]").append(message).append("\n");
  }

  //エラーログ追加
  public void appendError(String message){
    log.append("[ERROR]").append(message).append("\n");
  }

  //現在のログ取得
  public String getLog(){
    return log.toString();
  }

  //ログクリア
  public void clear(){
    log.setLength(0);
  }
}
