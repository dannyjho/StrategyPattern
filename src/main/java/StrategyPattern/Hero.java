package StrategyPattern;

public class Hero {
    private final String name;
    private int hp = 500;
    private final AttackType attackType;

    public String getName() {
        return name;
    }

    public Hero(String name, AttackType attackType) {
        this.name = name;
        this.attackType = attackType;
    }

    public void attack(Hero hero) {
        attackType.attack(this, hero);
    }

    void damage(int damage) {
        setHp(getHp() - damage);
        System.out.printf("英雄 %s 受到 %s 點傷害，剩餘血量 %s\n", name, damage, hp);
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public int getHp() {
        return hp;
    }

    public boolean isDead() {
        return hp == 0 || hp < 0;
    }
}
