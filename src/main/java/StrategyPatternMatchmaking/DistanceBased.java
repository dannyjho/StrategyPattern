package StrategyPatternMatchmaking;

public class DistanceBased implements MatchStrategy{
    public int calculateMatchScore(User user, User other) {
        return (user.getX() - other.getX()) * (user.getX() - other.getX()) +
                (user.getY() - other.getY()) * (user.getY() - other.getY());
    }

    public int getInitialValue() {
        return Integer.MAX_VALUE;
    }

    public boolean isBetterMatch(int currentScore, int bestScore) {
        return currentScore < bestScore;
    }
}
