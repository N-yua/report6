package jp.ac.uryukyu.ie.e235743;


public class Monster {
    private int number;
    private String name;
    private int hp;
    private int attack;

    //コンストラクタ
    public Monster(int number,String name,int hp,int attack){
        this.number = number;
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    //getterメソッド
    public int getNumber(){
        return number;
    }
    public int getHp(){
        return hp;
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
    public void setattack(int attack){
        this.attack = attack;
    }

    //共通した戦いコマンド
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
        
    }
}
