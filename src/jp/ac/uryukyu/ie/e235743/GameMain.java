package jp.ac.uryukyu.ie.e235743;

import java.util.ArrayList;
import java.util.List;

public class GameMain {
    public static void main(String[] args){

//モンスターと攻撃メソッド

    Firetype fire = new Firetype(1, "ほのお", 50, 10);
    Firetype water = new Firetype(1, "みず", 50, 10);
    Firetype grass= new Firetype(1, "くさ", 50, 10);
    final Firetype[] monsters = {fire,water,grass};




    EnemyMonster enemy = new EnemyMonster(2, "でんき", 50, 10);
    Attack attack = new Attack();
    final String[] TYPES={"1 ほのお","2 みず","3 くさ"};
    ArrayList<Monster> list = new ArrayList<>();

    

//モンスターを選択
        for(int i = 0; i < 3; i ++){
            System.out.println(TYPES[i]);
            }

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

//ライバルが勝負を仕掛けてくる

        System.out.println("ライバルのホワイトが勝負を仕掛けてきた！");
        System.out.println("ホワイト『ゆけっ！俺の相棒！" + enemy.getMonstername() + "!』");
        enemy.stetas();
        System.out.println("バトル開始！");


//バトルスタート
        switch (m) {
            //ほのおの場合
            case 1:
            //どちらかのHPが０になるまで戦闘を続ける。
            while(enemy.getHp() > 0 && fire.getHp() > 0){
                attack.execute(fire, enemy); //戦闘中に技を選択できるターンバトルにしたい
                attack.execute(enemy, fire);
            }
            System.out.println("戦闘終了"); //勝敗を表示したい
                break;
            //みずの場合
            case 2:
            //どちらかのHPが０になるまで戦闘を続ける。
            while(enemy.getHp() > 0 && fire.getHp() > 0){
                attack.execute(water, enemy);
                attack.execute(enemy, water);
            }
            System.out.println("戦闘終了");
                break;
            //くさの場合
            case 3:
            while(enemy.getHp() > 0 && fire.getHp() > 0){
                attack.execute(grass, enemy);
                attack.execute(enemy, grass);
            }
            System.out.println("戦闘終了");
                break;
        }
//戦闘終了
    


    }
}
