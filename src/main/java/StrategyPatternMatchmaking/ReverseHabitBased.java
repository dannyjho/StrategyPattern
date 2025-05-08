package StrategyPatternMatchmaking;

import java.util.HashSet;
import java.util.Set;

public class ReverseHabitBased implements MatchStrategy{
    public int calculateMatchScore(User user, User other) {
        Set<String> commonHabits = new HashSet<>(user.getHabits());
        commonHabits.retainAll(other.getHabits());
        return commonHabits.size(); // 返回交集大小
    }

    public int getInitialValue() {
        return Integer.MAX_VALUE;
    }

    public boolean isBetterMatch(int currentScore, int bestScore) {
        return currentScore < bestScore;
    }
}
