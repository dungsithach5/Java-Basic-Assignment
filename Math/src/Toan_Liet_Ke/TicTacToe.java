package Toan_Liet_Ke;

import java.util.Scanner;

public class TicTacToe {
	private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        InputBoard();
    }

    public void playGame() {
        boolean gameFinished = false;

        while (!gameFinished) {
            printBoard();
            int[] move = getPlayerMove();
            int row = move[0];
            int col = move[1];

            if (isValidMove(row, col)) {
                makeMove(row, col);
                if (isWinningMove(row, col)) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameFinished = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameFinished = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }
    }

    void InputBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    private int[] getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player " + currentPlayer + "'s TURN");
        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;
        return new int[]{row, col};
    }

    private boolean isValidMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            return true;
        }
        return false;
    }

    private void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    private boolean isWinningMove(int row, int col) {
        // Check row
        if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
            return true;
        }
        // Check column
        if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) {
            return true;
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}


