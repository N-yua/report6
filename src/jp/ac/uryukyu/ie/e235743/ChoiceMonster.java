package jp.ac.uryukyu.ie.e235743;

import java.util.ArrayList;
import java.util.List;

public class ChoiceMonster {

    public static void Monsterlist(){

        Monster monster1 = new Monster(1, "ほのお", 50, 5);
        Monster monster2 = new Monster(2, "みず", 50, 5);
        Monster monster3 = new Monster(3, "くさ", 50, 5);

        //モンスター３たいのリスト
        List<Monster> monsters = new ArrayList<Monster>();
        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);

        System.out.println("この３体から１匹のモンスターを選ぶんじゃ！");
        for(int i=0;i<monsters.size();++i){
            System.out.println(monsters.get(i));
        }
    }

    public static void wazalist(){

    }

}
