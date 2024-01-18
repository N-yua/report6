package jp.ac.uryukyu.ie.e235743;

public class Firetype extends Monster{

    //Monster継承
    public Firetype(int number, String name, int hp,int attack) {
        super(number, name, hp,attack);
    }


    public void waza(){
        System.out.println(getMonstername()+ "は" + "を使った！");
    }

    
}
