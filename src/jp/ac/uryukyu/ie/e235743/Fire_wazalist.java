package jp.ac.uryukyu.ie.e235743;

public class Fire_wazalist implements BaseAttack{
    
    public void execute(Monster_base executer, Monster_base target) {

        final String[] TYPES={"1 ほのおのキバ","2 ニトロチャージ","3 かえんボール"};

        for(int i = 0; i < 3; i ++){
            System.out.println(TYPES[i]);
            }

        System.out.println("\nわざコマンドを入力してください");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt();

        switch (m) {
            case 1:
            System.out.println(TYPES[0]+ "を繰り出した！");
            if(executer.getHp() > 0){
                System.out.print(executer.getAttack() + "ポイント与えた");
                target.damage(executer.getAttack());
                System.out.println("\n" + target.getMonstername() + "の残りHP:" + target.getHp());
                
            }
                break;
            case 2:
            System.out.println(TYPES[1] + "を繰り出した！");
            if(executer.getHp() > 0){
                System.out.print(executer.getAttack() + "ポイント与えた");
                target.damage(executer.getAttack());
                System.out.println("\n" + target.getMonstername() + "の残りHP:" + target.getHp());
                
            }
                break;
            case 3:
            System.out.println(TYPES[2] + "を繰り出した！");  
            if(executer.getHp() > 0){
                System.out.print(executer.getAttack() + "ポイント与えた");
                target.damage(executer.getAttack());
                System.out.println("\n" + target.getMonstername() + "の残りHP:" + target.getHp());
                
            }
        }
    }
    
}
