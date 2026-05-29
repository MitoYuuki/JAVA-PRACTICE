package day50_task_management;

import java.util.ArrayList;
import java.util.List;

/*
 * タスククラス
 * タスク名・担当者・完了状態を管理
 */
class Task {

  // タスク名
  private String title;

  // 担当者
  private String user;

  // 完了状態
  private boolean completed;

  /*
   * コンストラクタ
   * タスク情報を初期化
   */
  public Task(
    String title,
    String user,
    boolean completed
  ){

    this.title = title;
    this.user = user;
    this.completed = completed;
  }

  // タスク名取得
  public String getTitle(){
    return title;
  }

  // 担当者取得
  public String getUser(){
    return user;
  }

  // 完了状態取得
  public boolean isCompleted(){
    return completed;
  }

  // 完了状態更新
  public void setCompleted(
    boolean completed
  ){

    this.completed = completed;
  }

  // タスク情報表示
  public void showInfo(){

    System.out.println(
      "タスク : " + title
    );

    System.out.println(
      "担当者 : " + user
    );
  }
}

public class Main {

  /*
   * 未完了タスク数を取得
   */
  public static int countIncompleteTasks(
    List<Task> tasks
  ){

    int count = 0;

    for(Task t : tasks){

      if(!t.isCompleted()){
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    // タスク一覧
    List<Task> tasks =
      new ArrayList<>();

    // タスク追加
    tasks.add(
      new Task(
        "ログイン機能作成",
        "Tanaka",
        false
      )
    );

    tasks.add(
      new Task(
        "DB接続確認",
        "Sato",
        true
      )
    );

    tasks.add(
      new Task(
        "APIテスト",
        "Suzuki",
        false
      )
    );

    // タスク一覧表示
    for(Task t : tasks){

      t.showInfo();

      // 完了状態確認
      if(t.isCompleted()){

        System.out.println(
          "完了済み"
        );

      } else {

        System.out.println(
          "未完了"
        );
      }

      // login関連タスク判定
      if(
        t.getTitle()
         .contains("ログイン")
      ){

        System.out.println(
          "認証関連タスク"
        );
      }

      System.out.println("-----");
    }

    // タスク完了更新
    tasks.get(0)
         .setCompleted(true);

    // 未完了タスク数表示
    System.out.println(
      "未完了タスク数 : " +
      countIncompleteTasks(tasks)
    );
  }
}