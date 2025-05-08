package StrategyPatternMatchmaking;

public interface MatchStrategy {

    int calculateMatchScore(User user, User other);

    int getInitialValue();

    boolean isBetterMatch(int currentScore, int bestScore);
}
