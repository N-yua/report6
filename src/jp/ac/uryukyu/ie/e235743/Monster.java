package jp.ac.uryukyu.ie.e235743;
/**
 * Monsterクラス<br>
 * ほのお、くさ、みずの元となるタイプを持たないモンスタークラス
 */
public class Monster extends Monster_base{

/**
 * Monster_baseを継承したもの
 * @param level　モンスターレベル
 * @param name　モンスターの名前
 * @param hp　モンスターのHP
 * @param attack　モンスターの攻撃力
 */
    //Monster継承
    public Monster(int level, String name, int hp,int attack) {
        super(level, name, hp,attack);
    }
    
}
