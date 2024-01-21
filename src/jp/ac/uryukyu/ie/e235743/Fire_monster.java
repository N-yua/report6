package jp.ac.uryukyu.ie.e235743;
/**
 * Fire_monsterクラス<br>
 * ほのおタイプの技を持つモンスターのクラス
 */
public class Fire_monster implements BaseAttack{

/**
 * BaseAttackを上書きし、ほのおの技を持ったモンスター<br>
 */
    public void execute(Monster_base executer, Monster_base target) {
    Attack attack = new Attack();
    Monster fire = new Monster(1, "ほのお", 50, 10);
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
            attack.attack(fire, target);
                break;
            case 2:
            System.out.println(TYPES[1] + "を繰り出した！");
            attack.attack(fire, target);
                break;
            case 3:
            System.out.println(TYPES[2] + "を繰り出した！");  
            attack.attack(fire, target);
        }
    }
    
}
    
