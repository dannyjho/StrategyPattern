package StrategyPatternMatchmaking;

import java.util.List;

public class MatchmakingSystem {
    public User matchmaking(User user, List<User> users, MatchStrategy matchStrategy) {

        int bestScore = matchStrategy.getInitialValue();// 策略決定初始分數
        User bestMatch = null;
        for (User other : users) {
            if (other.getId() == user.getId()) continue; // 跳過自己

            int currentScore = matchStrategy.calculateMatchScore(user, other);

            if (bestMatch == null) {
                bestMatch = other;
            }

            if (currentScore == bestScore) {
                bestMatch = bestMatch.getId() < other.getId() ? bestMatch : other;
            }

            if (matchStrategy.isBetterMatch(currentScore, bestScore)) {
                bestScore = currentScore;
                bestMatch = other;

            }
        }
        return bestMatch;
    }
}
