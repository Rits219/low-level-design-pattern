package TicTacToeGame.Model;

public class Board {
    public int size;
    public PlayingPiece[][] playingBoard;

    public Board(int size) {
        this.size = size;
        this.playingBoard = new PlayingPiece[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (playingBoard[i][j] != null) {
                    System.out.print(playingBoard[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println("\n");
        }
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
        if (playingBoard[row][column] != null) {
            return false;
        }
        playingBoard[row][column] = playingPiece;
        return true;
    }

    public boolean anyFreeSpace() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (playingBoard[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
