package LLDSnakeAndLadder.biz;

import LLDSnakeAndLadder.model.Board;
import LLDSnakeAndLadder.model.Cell;
import LLDSnakeAndLadder.model.Dice;
import LLDSnakeAndLadder.model.Player;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Deque<Player> playerList;
    Dice dice;
    Player winner = null;

    public Game() {
        initializeGame();
    }

    public void initializeGame() {
        board = new Board(3, 2, 1);
        playerList = new LinkedList<>();
        dice = new Dice(1);
        Player player1 = new Player("1", 0);
        Player player2 = new Player("2", 0);
        playerList.addFirst(player1);
        playerList.addFirst(player2);
    }

    public void playGame() {
        while (winner == null) {
            Player currentPlayer = playerList.removeFirst();
            playerList.addLast(currentPlayer);

            //current player display
            int currentPosition = currentPlayer.getCurrentPosition();
            System.out.println("player turn is " + currentPlayer.getPayerId() + "and current position is " + currentPosition);

            //current player rolling the dice
            System.out.println("rolling the dice =>");
            int diceNumber = dice.rollDice();
            System.out.println("payer rolled dice and got" + diceNumber);

            //finding the position of current player
            int nextPosition = findNextPosition(currentPosition, diceNumber);
            currentPlayer.setCurrentPosition(nextPosition);
            //checking winning condition
            if (checkWinningCondition(nextPosition)) {
                winner = currentPlayer;
            }

        }

        System.out.println("winner is " + winner);
    }

    private int findNextPosition(int currentPosition, int diceNumber) {
        int nextPosition = currentPosition + diceNumber;
        if (checkWinningCondition(nextPosition)) {
            return nextPosition;
        }
        Cell cell = board.getCell(nextPosition);
        if (cell.getJump() != null) {
            System.out.println("jump exists from " + cell.getJump().getStart() + " to " + cell.getJump().getEnd());
            nextPosition = cell.getJump().getEnd();
        }
        System.out.println("player next position is " + nextPosition);
        return nextPosition;
    }

    private boolean checkWinningCondition(int position) {
        return position >= board.cells.length * board.cells.length - 1;
    }
}
