package StrategyPatternMatchmaking;

import java.util.Set;

public class User {
    private int id;
    private final Gender gender;
    private final int age;
    private final String intro;
    private Set<String> habits;
    private final int x;
    private final int y;

    public User(int id, Gender gender, int age, String intro, Set<String> habits, int x, int y) {
        this.id = id;
        this.gender = gender;
        if (age <= 0) {
            throw new IllegalArgumentException("Invalid age value: " + age);
        }
        this.age = age;
        if (intro.length() > 200) {
            throw new IllegalArgumentException("Intro length should less than 200: " + intro.length());
        }
        this.intro = intro;
        for (String habit : habits) {
            if (habit.length() <= 1 || habit.length() >= 10) {
                throw new IllegalArgumentException("habit length should more than 1 but less than 10: " + habit.length());
            }
        }
        this.habits = habits;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Set<String> getHabits() {
        return habits;
    }
}
