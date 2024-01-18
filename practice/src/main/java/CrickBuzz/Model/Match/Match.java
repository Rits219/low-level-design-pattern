package CrickBuzz.Model.Match;

import CrickBuzz.Model.Inning;
import CrickBuzz.Model.Team;

import java.util.List;

public class Match {
    Team teamA;
    Team teamB;
    String venue;
    long date;
    List<Inning> innings;
    MatchType matchType;
}
