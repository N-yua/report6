package jp.ac.uryukyu.ie.e235743;

public class Attack implements BaseAttack{

    int attackname;

    @Override
    public String name() {
        return "ほのおのキバ";
    }

    @Override
    public void execute(Monster executer, Monster target) {
        if(executer.getHp() > 0){
            System.out.println(executer.getMonstername() + "は" + target.getMonstername() + "に攻撃した！");
            System.out.print(executer.getAttack() + "ポイント与えた");
            target.damage(executer.getAttack());
            System.out.println("\n" + target.getHp());
            
        }
    
    
    }



    
    
}
