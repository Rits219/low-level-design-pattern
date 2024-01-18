package CrickBuzz.Model;

import java.util.Deque;
import java.util.Map;

public class BowlingController {
    Deque<Player> players;
    Map<Player, Integer> playerVsNoOfOvers;
    Player currentBowler;
}
