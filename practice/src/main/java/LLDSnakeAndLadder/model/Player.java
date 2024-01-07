package LLDSnakeAndLadder.model;

public class Player {
    String payerId;
    int currentPosition;

    public String getPayerId() {
        return payerId;
    }

    public Player(String playerId, int currentPosition) {
        this.payerId = playerId;
        this.currentPosition = currentPosition;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

}
