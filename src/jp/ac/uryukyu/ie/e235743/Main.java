package jp.ac.uryukyu.ie.e235743;

public class Main {
    public static void main(String[] args){

//インスタンス
    EnemyMonster enemy = new EnemyMonster(2, "でんき", 50, 10);


//モンスターを選択
    ChoiceMonster choiceMonster = new ChoiceMonster();
    choiceMonster.choice();

//ライバルが勝負を仕掛けてくる
        System.out.println("ライバルのホワイトが勝負を仕掛けてきた！");
        System.out.println("ホワイト『ゆけっ！俺の相棒！" + enemy.getMonstername() + "!』");
        enemy.stetas();
        System.out.println("バトル開始！");

//バトルスタート
        Buttle buttle = new Buttle();
        buttle.buttle();
    }
}
