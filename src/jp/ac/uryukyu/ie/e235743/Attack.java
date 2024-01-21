package jp.ac.uryukyu.ie.e235743;

public class Attack{

    public void attack(Monster_base executer, Monster_base target) {
        if(executer.getHp() > 0){

            System.out.print(executer.getAttack() + "ポイント与えた");
            target.damage(executer.getAttack());
            System.out.println("\n" + target.getMonstername() + "の残りHP:" + target.getHp());
            
        }
    }   
}
