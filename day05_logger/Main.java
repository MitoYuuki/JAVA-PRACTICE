package day05_logger;

public class Main {
  public static void main(String[] args) {

    Logger logger = new Logger();
    
    logger.appendLog("処理開始");
    logger.appendLog("ユーザー作成");
    logger.appendError("データ不正");
    logger.appendLog("処理終了");

    //ログ出力
    System.out.println(logger.getLog());

    //クリア確認
    logger.clear();
    System.out.println("----クリア後----");
  }
}
