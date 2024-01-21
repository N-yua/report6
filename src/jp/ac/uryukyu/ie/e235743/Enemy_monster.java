package jp.ac.uryukyu.ie.e235743;

/**
 * Enemy_monsterクラス
 * 敵が攻撃する時のクラス<br>
 * BaseAttackをインターフェースした
 */
public class Enemy_monster implements BaseAttack{
//インスタンス
    Attack attack = new Attack();
    Monster enemy = new Monster(1, "くさ", 50, 10);
/**
 * Baseattackのexecuteメソッドを上書きしたもの
 */
    @Override
    public void execute(Monster_base enemy, Monster_base target) {
        attack.attack(enemy, target);
    }

}
