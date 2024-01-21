package jp.ac.uryukyu.ie.e235743;

/**
 * Enemyクラス
 * 敵モンスターの情報と敵のみが実行するメッセージを表示する
 */
public class Enemy extends Monster_base{

    /**
     * Monster_baseを継承
     * @param level　敵のレベル
     * @param name　敵モンスターの名前
     * @param hp　敵モンスターのHP
     * @param attack　敵モンスターの攻撃力
     */
    public Enemy(int level, String name, int hp,int attack) {
        super(level,name, hp,attack);
    }
    
/**
 * 敵のみが実行するメッセージを追加したもの
 */
    public void massage(){
        System.out.println("？？？『おい！俺と勝負しろ！』");
        System.out.println("ライバルのグリーンが勝負を仕掛けてきた！");
        System.out.println("グリーンは" + getMonstername() + "を繰り出した");
    }
}
