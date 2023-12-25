package TicTacToeGame;

import TicTacToeGame.Model.Board;
import TicTacToeGame.Model.PieceType;
import TicTacToeGame.Model.Player;
import TicTacToeGame.Model.PlayingPieceO;
import TicTacToeGame.Model.PlayingPieceX;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Deque<Player> players;
    Board board;

    public void initializeGame() {
        players = new LinkedList<>();
        Player player1 = new Player("Player 1", new PlayingPieceX());
        Player player2 = new Player("Player 2", new PlayingPieceO());
        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }

    public void start() {

        boolean tie = false;
        while (!tie) {
            Player playerTurn = players.removeFirst();
            board.printBoard();

            System.out.println("enter position to place");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean isEntered = board.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
            if (!isEntered) {
                System.out.println("not able to add piece to this values,pls again enter postions");
                players.addFirst(playerTurn);
                continue;
            }

            boolean isWinner = isThereWinner(playerTurn.playingPiece.pieceType, inputRow, inputColumn);
            if (isWinner) {
                System.out.println("winner is " + playerTurn.name);
                return;
            }

            if (!board.anyFreeSpace()) {
                System.out.println("match is tied");
                tie = true;
                continue;
            }
            players.addLast(playerTurn);
        }
        System.out.println("match is tie");
    }

    private boolean isThereWinner(PieceType pieceType, int row, int column) {
        //match symbol row wise.
        boolean rowWiseMatch = true;
        for (int j = 0; j < board.size; j++) {
            if (board.playingBoard[row][j] == null || board.playingBoard[row][j].pieceType != pieceType) {
                rowWiseMatch = false;
            }
        }
        //match symbol column wise.
        boolean columnWiseMatch = true;
        for (int i = 0; i < board.size; i++) {
            if (board.playingBoard[i][column] == null || board.playingBoard[i][column].pieceType != pieceType) {
                columnWiseMatch = false;
            }
        }

        //diagonal Wise match.
        boolean diagonalWiseMatch = true;
        for (int i = 0, j = 0; i < board.size; i++, j++) {
            if (board.playingBoard[i][j] == null || board.playingBoard[i][j].pieceType != pieceType) {
                diagonalWiseMatch = false;
            }
        }

        //anti diagonal Wise match.
        boolean antiDiagonalWiseMatch = true;
        for (int i = board.size - 1, j = 0; i >= 0; i--, j++) {
            if (board.playingBoard[i][j] == null || board.playingBoard[i][j].pieceType != pieceType) {
                antiDiagonalWiseMatch = false;
            }
        }

        return rowWiseMatch || columnWiseMatch || diagonalWiseMatch || antiDiagonalWiseMatch;

    }

}
