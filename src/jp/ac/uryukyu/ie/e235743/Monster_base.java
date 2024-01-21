package jp.ac.uryukyu.ie.e235743;


public class Monster_base {
    private String name;
    private int hp;
    private int attack;
    private int level;
    private int number;

    //コンストラクタ
    public Monster_base(int level,String name,int hp,int attack){
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.attack = attack;
    }

    //getterメソッド
    public int getNumber(){
        return number;
    }
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
    public void setNumber(int number){
        this.number = number;
    }
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
    
    public void damage(int damage){
        hp -= damage;
    }

    public void wounded(int damage){
        hp -= damage;
        if(hp < 0){            
        System.out.printf(this.name+"は倒れた。\n");
        System.out.printf("目の前が真っ暗になった！\n");
        }
    }

    public void stetas(){
        System.err.println(this.name + "\n" + "HP:" + this.hp + "\n" + "レベル:" + this.level);
    }

}
