package jp.ac.uryukyu.ie.e235743;
/**
 * ChoiceMonsterクラス<br>
 * モンスターを選択するときのクラス
 */
public class ChoiceMonster {

//インスタンス
    Monster fire = new Monster(1, "ほのお", 50, 10);
    Monster water = new Monster(1, "みず", 50, 10);
    Monster grass= new Monster(1, "くさ", 50, 10);
    final String[] TYPES={"1 ほのお","2 みず","3 くさ"};

/**
 * 選択するメソッド<br>
 * ３つのタイプのモンスターを表示しその中から1体選択する
 */
    public void choice(){
        for(int i = 0; i < 3; i ++){
            System.out.println(TYPES[i]);
            }

        System.out.println("\nコマンドを入力してください");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt();

        switch (m) {
            case 1:
            System.out.println(TYPES[0]+ "に決めた！");
            fire.stetas(); 
                break;
            case 2:
            System.out.println(TYPES[1] + "に決めた！");
            water.stetas();
                break;
            case 3:
            System.out.println(TYPES[2] + "に決めた！");   
            grass.stetas();
            default:
            System.out.println("この３匹から選んでください！");
                break;
        }

    }

}
