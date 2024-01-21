package jp.ac.uryukyu.ie.e235743;

public class Buttle {
    //インスタンス
    Monster fire = new Monster(1, "ほのお", 50, 10);
    Monster water = new Monster(1, "みず", 50, 10);
    Monster grass= new Monster(1, "くさ", 50, 10);
    EnemyMonster enemy = new EnemyMonster(2, "でんき", 50, 10);

    Fire_wazalist fire_wazalist = new Fire_wazalist();
    Water_wazalist water_wazalist = new Water_wazalist();
    Grass_wazalist grass_wazalist = new Grass_wazalist();
    Enemy_wazalist enemy_wazalist = new Enemy_wazalist();


    public void buttle(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt();
        switch (m) {
            //ほのおの場合
            case 1:
            //どちらかのHPが０になるまで戦闘を続ける。
            while(enemy.getHp() > 0 && fire.getHp() > 0){
                fire_wazalist.execute(fire, enemy);//戦闘中に技を選択できるターンバトルにしたい
                enemy_wazalist.execute(enemy, fire);
            }
            System.out.println("戦闘終了"); //勝敗を表示したい
                break;
            //みずの場合
            case 2:
            //どちらかのHPが０になるまで戦闘を続ける。
            while(enemy.getHp() > 0 && fire.getHp() > 0){
                water_wazalist.execute(water, enemy);
                enemy_wazalist.execute(enemy, water);
            }
            System.out.println("戦闘終了");
                break;
            //くさの場合
            case 3:
            while(enemy.getHp() > 0 && fire.getHp() > 0){
               grass_wazalist.execute(grass, enemy);
               enemy_wazalist.execute(enemy, grass);
            }
            System.out.println("戦闘終了");
                break;
        }
    }
}
