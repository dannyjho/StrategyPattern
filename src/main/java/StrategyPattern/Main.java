package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("小明", new FireBall());
        Hero hero1 = new Hero("小美", new WaterBall());
        Game game = new Game(hero, hero1);
        System.out.println("遊戲開始");
        game.start();
    }
}
