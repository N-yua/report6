package jp.ac.uryukyu.ie.e235743;

public class Water_wazalist implements BaseAttack{

    @Override
    public void execute(Monster_base executer, Monster_base target) {
        Attack attack = new Attack();
        Monster water = new Monster(1, "みず", 50, 10);
        final String[] TYPES={"1 みずてっぽう","2 アクアリング","3 みずのはどう"};

        for(int i = 0; i < 3; i ++){
            System.out.println(TYPES[i]);
            }

        System.out.println("\nわざコマンドを入力してください");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt();

        switch (m) {
            case 1:
            System.out.println(TYPES[0]+ "を繰り出した！");
            attack.attack(water, target);
                break;
            case 2:
            System.out.println(TYPES[1] + "を繰り出した！");
            attack.attack(water, target);
                break;
            case 3:
            System.out.println(TYPES[2] + "を繰り出した！");  
            attack.attack(water, target);
        }
    }
    
}
