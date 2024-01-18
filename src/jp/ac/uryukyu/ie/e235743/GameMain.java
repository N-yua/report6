package jp.ac.uryukyu.ie.e235743;

import java.util.ArrayList;
import java.util.List;

public class GameMain {
    public static void main(String[] args){

//モンスターと攻撃メソッド

    Firetype fire = new Firetype(1, "ほのお", 50, 10);
    Firetype water = new Firetype(1, "みず", 50, 10);
    Firetype grass= new Firetype(1, "くさ", 50, 10);
    EnemyMonster enemy = new EnemyMonster(2, "でんき", 50, 10);
    Attack attack = new Attack();
    final String[] TYPES={"ほのお","みず","くさ"};
    ArrayList<Monster> list = new ArrayList<>();

    

//モンスターを選択

        System.out.println("\nコマンドを入力してください");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt();

        switch (m) {
            case 1:
            System.out.println(TYPES[0]+ "に決めた！");
            fire.stetas(); 
                break;
            case 2:
            System.out.println(TYPES[1] + "に決めた！");
            water.stetas();
                break;
            case 3:
            System.out.println(TYPES[2] + "に決めた！");   
            grass.stetas();
            default:
            System.out.println("この３匹から選んでください！");
                break;
        }

//ライバルはデンキタイプを選択する

        System.err.println("ライバルのホワイトは"+ enemy.getMonstername()+"を選んだ");
        enemy.stetas();
        System.err.println("バトル開始！");


//バトルスタート
        attack.execute(water, enemy);

//戦闘終了
    


    }
}
