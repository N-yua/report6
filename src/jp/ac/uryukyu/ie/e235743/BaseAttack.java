package jp.ac.uryukyu.ie.e235743;
/**
 * BaseAttackクラス
 * 抽象クラス
 */

 /**
  * 攻撃をする際の抽象メソッド
  */
public interface BaseAttack {
    void execute(Monster_base executer, Monster_base target);

}
