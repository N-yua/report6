package jp.ac.uryukyu.ie.e235743;

public class Firetype extends Monster{

    private int act1;
    private int act2;
    private int act3;

    public Firetype(int number, String name, int hp,int attack) {
        super(number, name, hp,attack);
    }
    
    public int getAct1(){
        return act1;
    }

    public int getAct2(){
        return act2;
    }

    public int getAct3(){
        return act3;
    }

    


    
}
