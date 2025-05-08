package StrategyPattern;

public class WaterBall implements AttackType{
    public void attack(Hero attacker,Hero attacked){
        attacked.damage((int) (attacker.getHp() * 0.5));
    }
}
