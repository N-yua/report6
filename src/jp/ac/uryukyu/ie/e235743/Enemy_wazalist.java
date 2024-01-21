package jp.ac.uryukyu.ie.e235743;

public class Enemy_wazalist implements BaseAttack{

    Attack attack = new Attack();
    Monster enemy = new Monster(1, "くさ", 50, 10);

    @Override
    public void execute(Monster_base enemy, Monster_base target) {
        System.out.println(enemy.getMonstername() + "はビリビリを繰り出した！");
        attack.attack(enemy, target);
    }

}
