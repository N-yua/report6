package jp.ac.uryukyu.ie.e235743;
/**
 * Buttleクラス<br>
 * 戦闘中の様子をまとめたクラス
 */
public class Buttle {
    //インスタンス
    Monster fire = new Monster(1, "ほのお", 50, 10);
    Monster water = new Monster(1, "みず", 50, 10);
    Monster grass= new Monster(1, "くさ", 50, 10);
    Enemy enemy = new Enemy(2, "でんき", 50, 10);

    Fire_monster fire_wazalist = new Fire_monster();
    Water_monster water_wazalist = new Water_monster();
    Grass_monster grass_wazalist = new Grass_monster();
    Enemy_monster enemy_wazalist = new Enemy_monster();

/**
 * 最初に手持ちのモンスターを選び、バトルに繰り出す<br>
 * ３つの技からどの技を出すか選び、お互いのHPが０以下になるまで戦闘を繰り返す
 */
    public void buttle(){
        //本来ならば手持ちのポケモンは1体のみだが、実装できたのはここまで
        System.out.println("どのポケモンを繰り出しますか？");
        final String[] TYPES={"1 ほのお","2 みず","3 くさ"};
        for(int i = 0; i < 3; i ++){
            System.out.println(TYPES[i]);
        }

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt();
        switch (m) {
            //ほのおの場合
            case 1:
            //どちらかのHPが０になるまで戦闘を続ける。
            while(enemy.getHp() > 0 && fire.getHp() > 0){
                fire_wazalist.execute(fire, enemy);//戦闘中に技を選択できるターンバトル
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