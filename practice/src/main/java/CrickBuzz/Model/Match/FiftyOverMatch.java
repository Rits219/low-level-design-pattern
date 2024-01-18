package CrickBuzz.Model.Match;

public class FiftyOverMatch implements MatchType {
    @Override
    public int getNoOfOvers() {
        return 50;
    }

    @Override
    public int getNoOfOverPerBowler() {
        return 10;
    }
}
