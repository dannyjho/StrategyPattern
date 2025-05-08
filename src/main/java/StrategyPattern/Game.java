package StrategyPattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
    private final List<Hero> heroes;

    public Game(Hero hero1, Hero hero2) {
        this.heroes = Arrays.asList(hero1, hero2);
    }

    public void start() {
        nextTurn();
    }

    private void nextTurn() {
        Hero attacker = heroes.get(0);
        Hero attacked = heroes.get(1);
        attacker.attack(attacked);
        Collections.swap(heroes, 0, 1);
        if (attacked.isDead()) {
            System.out.printf("英雄 %s 死亡! %s 獲勝！\n", attacked.getName(), attacker.getName());
        } else {
            nextTurn();
        }
    }
}
