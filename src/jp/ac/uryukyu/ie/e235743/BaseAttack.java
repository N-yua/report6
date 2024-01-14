package jp.ac.uryukyu.ie.e235743;

public class BaseAttack {
    int number;
    int attack;

    //コンストラクタ
    public BaseAttack(int number,int attack){
        this.number = number;
        this.attack = attack;
    }

    //getterメソッド
    public int getnumber(){
        return number;
    }
    public int getattack(){
        return attack;
    }



    //setterメソッド
    public void setNumber(int number){
        this.number = number;
    }
    public void setattack(int attack){
        this.attack = attack;
    }

}
