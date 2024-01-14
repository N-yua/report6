package jp.ac.uryukyu.ie.e235743;

public class Monster {
    int number;
    String name;
    int hp;

    //コンストラクタ
    public Monster(int number,String name,int hp){
        this.number = number;
        this.name = name;
        this.hp = hp;
    }

    //getterメソッド
    public int getnumber(){
        return number;
    }
    public int gethp(){
        return hp;
    }
    public String getmonstername(){
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




}
