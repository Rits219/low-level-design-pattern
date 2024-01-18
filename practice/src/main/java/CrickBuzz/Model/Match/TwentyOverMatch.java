package CrickBuzz.Model.Match;

public class TwentyOverMatch implements MatchType {

    @Override
    public int getNoOfOvers() {
        return 20;
    }

    @Override
    public int getNoOfOverPerBowler() {
        return 4;
    }
}
