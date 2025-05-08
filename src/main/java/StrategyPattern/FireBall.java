package StrategyPattern;

public class FireBall implements AttackType{
    public void attack(Hero attacker,Hero attacked){
        for (int i = 0; i < 3; i++) {
            attacked.damage(50);
        }
    }
}
