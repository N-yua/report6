package jp.ac.uryukyu.ie.e235743;
/**
 * Monster_baseメソッド<br>
 * 全モンスターの共通の情報を持つ親クラス
 */


public class Monster_base {
/**モンスターの名前 */
    private String name;
/**モンスターのHP */
    private int hp;
/**モンスターの攻撃力 */
    private int attack;
/**モンスターのレベル */
    private int level;


/**
 * コンストラクタ
 * @param level　モンスターレベル
 * @param name　モンスターの名前
 * @param hp　モンスターのHP
 * @param attack　モンスターの攻撃力
 */
    public Monster_base(int level,String name,int hp,int attack){
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.attack = attack;
    }

    //getterメソッド

    public int getHp(){
        return hp;
    }
    public int getLvel(){
        return level;
    }
    public int getAttack(){
        return attack;
    }
    public String getMonstername(){
        return name; 
    }

    //setterメソッド
 
    public void setName(String name){
        this.name = name;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }

    //共通
/**
 * 攻撃を受けた時の残りHP
 * @param damage　攻撃を受けた時の残りHP
 */
    public void damage(int damage){
        hp -= damage;
    }

/**
 * モンスターの名前、HP、レベルを表示するメソッド
 */
    public void stetas(){
        System.err.println(this.name + "\n" + "HP:" + this.hp + "\n" + "レベル:" + this.level);
    }

/**
 * バトルを始める時の表示するメッセージ
 */
    public void massage(){
        System.out.println("『ゆけっ" + getMonstername() + "！』");
        System.out.println(this.name + "を繰り出した");
    }

}
