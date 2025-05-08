package StrategyPatternMatchmaking;

public class ReverseDistanceBased implements MatchStrategy{
    public int calculateMatchScore(User user, User other) {
        return (user.getX() - other.getX()) * (user.getX() - other.getX()) +
                (user.getY() - other.getY()) * (user.getY() - other.getY());
    }

    public int getInitialValue(){
        return Integer.MIN_VALUE;
    }

    public boolean isBetterMatch(int currentScore, int bestScore) {
        return currentScore > bestScore;
    }
}
