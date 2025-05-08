package StrategyPatternMatchmaking;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,Gender.MALE, 1, "", Set.of("Reading", "Gaming"), 0, 0);
        User user2 = new User(2,Gender.MALE, 2, "", Set.of("Gaming", "Cooking"), 3, 4);
        User user3 = new User(3,Gender.MALE, 3, "", Set.of("Reading"), 6, 8);
        User user4 = new User(4,Gender.MALE, 4, "", Set.of("Sports"), 0, 10);

        List<User> users = List.of(user1, user2, user3, user4);

        MatchmakingSystem system = new MatchmakingSystem();

        System.out.println("最近距離配對: " + system.matchmaking(user1, users, new DistanceBased()).getId());
        System.out.println("最遠距離配對: " + system.matchmaking(user1, users, new ReverseDistanceBased()).getId());
        System.out.println("興趣最大交集配對: " + system.matchmaking(user1, users, new HabitBased()).getId());
        System.out.println("興趣最小交集配對: " + system.matchmaking(user1, users, new ReverseHabitBased()).getId());
    }
}
