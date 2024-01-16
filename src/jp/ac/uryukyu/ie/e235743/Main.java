package jp.ac.uryukyu.ie.e235743;
import java.util.Map;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args){


        Firetype f = new Firetype(1, "ほのお", 100,30);
        System.out.println("モンスター" + f.getMonstername() + "を生み出しました");
        f.sleep(10);

        EnemyMonster e = new EnemyMonster(2, "みず", 100, 30);
        System.out.println("モンスター" + e.getMonstername() + "を生み出しました");
        e.sleep(10);


//お試しTreeMapインスタンス生成



        System.out.println("この３匹のモンスターから１匹選んでください");
        System.out.println("\n1:ほのお 2:みず 3:くさ");
        System.out.println("\nコマンドを入力してください");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt();

        switch (m) {
            case 1:
            System.out.println("ほのおに決めた！");
                break;
            case 2:
            System.out.println("みずに決めた！");
                break;
            case 3:
            System.out.println("くさに決めた！");
            default:
            System.out.println("この３匹から選んでください！");
                break;
        }

    


    }
}
