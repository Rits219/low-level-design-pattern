package LLDSnakeAndLadder.model;

import java.util.Random;

public class Dice {
    int numberOfDice;
    int minNumber = 1;
    int maxNumber = 6;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int rollDice() {
        Random random = new Random();
        return random.nextInt((maxNumber - minNumber) + 1) + minNumber;
    }
}
