package jp.ac.uryukyu.ie.e235743;

public class Grass_wazalist implements BaseAttack{

@Override
    public void execute(Monster_base executer, Monster_base target) {

        final String[] TYPES={"1 リーフカッター","2 くさむすび","3 ギガドレイン"};
        Attack attack = new Attack();
        Monster grass = new Monster(1, "くさ", 50, 10);

        for(int i = 0; i < 3; i ++){
            System.out.println(TYPES[i]);
            }

        System.out.println("\nわざコマンドを入力してください");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt();

        switch (m) {
            case 1:
            System.out.println(TYPES[0]+ "を繰り出した！");
            attack.attack(grass, target);
                break;
            case 2:
            System.out.println(TYPES[1] + "を繰り出した！");
            attack.attack(grass, target);
                break;
            case 3:
            System.out.println(TYPES[2] + "を繰り出した！");  
            attack.attack(grass, target);
        }

    }
}
