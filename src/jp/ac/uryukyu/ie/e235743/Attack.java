package jp.ac.uryukyu.ie.e235743;

public class Attack implements BaseAttack{


    @Override
    public String name() {
        return "戦う";
    }

    @Override
    public void execute(Monster executer, Monster target) {
        if(executer.getHp() > 0){
            target.damage(executer.getAttack());
            System.out.println(executer.getMonstername() + "は" + target.getMonstername() + "に攻撃した！");
        }
    }



    
    
}
