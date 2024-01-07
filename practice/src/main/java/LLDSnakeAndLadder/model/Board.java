package LLDSnakeAndLadder.model;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    public Cell[][] cells;

    public Board(int boardSize, int numberOfSnake, int numberOfLadder) {
        initializeCells(boardSize);
        addSnakes(numberOfSnake, cells);
        addLadder(numberOfLadder, cells);
    }

    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private void addLadder(int numberOfLadder, Cell[][] cells) {
        while (numberOfLadder > 0) {
            int start = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int end = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            //biz logic
            Cell startCell = getCell(start);
            if (start < end && startCell.jump == null) {
                startCell.jump = new Jump(start, end);
                numberOfLadder--;
            }
        }
    }

    private void addSnakes(int numberOfSnake, Cell[][] cells) {
        while (numberOfSnake > 0) {
            int start = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int end = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            //biz logic
            Cell startCell = getCell(start);
            if (start > end && startCell.jump == null) {
                startCell.jump = new Jump(start, end);
                numberOfSnake--;
            }
        }
    }

    public Cell getCell(int number) {
        int rowIndex = number / cells.length;
        int columnIndex = number % cells.length;
        return cells[rowIndex][columnIndex];
    }
}
