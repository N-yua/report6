package jp.ac.uryukyu.ie.e235743;
/**
 * Attackクラス
 * 
 */
public class Attack{

/**
 * 攻撃メソッド<br>
 * 攻撃した時のメッセージ表示、相手のHPを減らすメソッド
 * @param executer 攻撃をする側(自分自身)
 * @param target　攻撃をしたい相手
 */
    public void attack(Monster_base executer, Monster_base target) {
        if(executer.getHp() > 0){
            System.out.print(executer.getMonstername() + "は" +target.getMonstername()+ "に" + executer.getAttack() + "ポイント与えた \n");
            target.damage(executer.getAttack());
            System.out.println("\n" + target.getMonstername() + "の残りHP:" + target.getHp());
        }
    }   
}
