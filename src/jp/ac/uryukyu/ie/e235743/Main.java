package jp.ac.uryukyu.ie.e235743;

/**
 * Mainメソッドです<br>
 * 
 * @author e235743
 */
public class Main {
    public static void main(String[] args){

//インスタンス
Enemy enemy = new Enemy(1, "でんき", 50, 10);

/**
 * モンスターを選択するChoiceMonsterクラスのインスタンスを生成し、choiceメソッドを呼び出す。
*/
    ChoiceMonster choiceMonster = new ChoiceMonster();
    choiceMonster.choice();

/**
 * enemy.massageを呼び出して、ライバルのメッセージと敵モンスターのステータスを表示
 */
        enemy.massage();
        enemy.stetas();
        System.out.println("バトル開始！");

/**
 *バトル中のButtleクラスのインスタンスを生成し、buttleメソッドを呼び出す。
 */
        Buttle buttle = new Buttle();
        buttle.buttle();
    }
}
