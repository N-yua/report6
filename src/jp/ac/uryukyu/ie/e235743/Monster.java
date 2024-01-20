package jp.ac.uryukyu.ie.e235743;


public class Monster {
    private String name;
    private int hp;
    private int attack;
    private int level;
    private int number;

    //コンストラクタ
    public Monster(int level,String name,int hp,int attack){
        this.number = number;
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
    public void sleep(int sleep){
        this.hp += sleep;
        System.out.print(this.name + "は眠りについた！" + sleep + "hp回復した！");
    }
    
    public void damage(int damage){
        hp -= damage;
    }

    public void wounded(int damage){
        hp -= damage;
        if(hp < 0){            
        System.out.printf(this.name+"は倒れた。\n");
        }
    }

    public void stetas(){
        System.err.println(this.name + "\n" + "HP:" + this.hp + "\n" + "レベル:" + this.level);
    }

}
