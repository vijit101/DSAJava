package TicTacToeJavaproj;

import java.util.Scanner;

public class playGame {
    private boolean gameOver = false;
    private boolean isPlayer1 = true;
    private final PlayerData player1 = new PlayerData();
    private final PlayerData player2 = new PlayerData();
    private final Board myGameBoard = new Board();
    private final Vector2<Integer> nextMoveCoordinates = new Vector2<>();
    private static playGame playGameInstance;

    private playGame() {}

    public static playGame getInstance() {
        if (playGameInstance == null) {
            playGameInstance = new playGame();
        }
        return playGameInstance;
    }

    public static void main(String[] args) {
        playGame game = playGame.getInstance();
        game.startGame();
    }

    private void startGame() {
        setupGame();
        drawBoard();

        while (!gameOver) {
            getPlayerInput();
            drawBoard();
            checkGameStatus();
            isPlayer1 = !isPlayer1; // Switch player
        }

        System.out.println("Game Over!");
    }

    private void setupGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player 1 Name: ");
        player1.Name = sc.nextLine();
        System.out.print("Enter Player 1 Symbol: ");
        player1.PlayerSymbol = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter Player 2 Name: ");
        player2.Name = sc.nextLine();
        System.out.print("Enter Player 2 Symbol: ");
        player2.PlayerSymbol = sc.next().charAt(0);

        System.out.print("Enter board Rows: ");
        myGameBoard.rows = sc.nextInt();
        System.out.print("Enter board Columns: ");
        myGameBoard.columns = sc.nextInt();

        if (myGameBoard.rows <= 0 || myGameBoard.columns <= 0) {
            myGameBoard.rows = myGameBoard.columns = 3; // Default size
        }
        myGameBoard.EmptyBoardSetup(myGameBoard.rows, myGameBoard.columns);
    }

    private void drawBoard() {
        for (int i = 0; i < myGameBoard.rows; i++) {
            System.out.print(">> ");
            for (int j = 0; j < myGameBoard.columns; j++) {
                System.out.print(myGameBoard.BoardArray[i][j] + " ");
                if (j < myGameBoard.columns - 1) {
                    System.out.print("| ");
                }
            }
            System.out.println(" <<");
            if (i < myGameBoard.rows - 1) {
                System.out.println("   " + "-".repeat((myGameBoard.columns * 3) - 1));
            }
        }
    }

    private void getPlayerInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println((isPlayer1 ? player1.Name : player2.Name) + "'s turn!");
        System.out.print("Enter row (0 to " + (myGameBoard.rows - 1) + "): ");
        nextMoveCoordinates.x = sc.nextInt();
        System.out.print("Enter column (0 to " + (myGameBoard.columns - 1) + "): ");
        nextMoveCoordinates.y = sc.nextInt();

        if (isValidMove(nextMoveCoordinates.x, nextMoveCoordinates.y)) {
            myGameBoard.BoardArray[nextMoveCoordinates.x][nextMoveCoordinates.y] =
                isPlayer1 ? player1.PlayerSymbol : player2.PlayerSymbol;
            myGameBoard.cellsFilled++;
        } else {
            System.out.println("Invalid move, try again.");
            getPlayerInput(); // Retry input
        }
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < myGameBoard.rows &&
               y >= 0 && y < myGameBoard.columns &&
               myGameBoard.BoardArray[x][y] == ' ';
    }

    private void checkGameStatus() {
        if (checkWinner()) {
            System.out.println((isPlayer1 ? player1.Name : player2.Name) + " wins!");
            gameOver = true;
        } else if (myGameBoard.cellsFilled == myGameBoard.rows * myGameBoard.columns) {
            System.out.println("It's a draw!");
            gameOver = true;
        }
    }

    private boolean checkWinner() {
        char symbol = isPlayer1 ? player1.PlayerSymbol : player2.PlayerSymbol;
        return checkRows(symbol) || checkColumns(symbol) || checkDiagonals(symbol);
    }

    private boolean checkRows(char symbol) {
        for (int i = 0; i < myGameBoard.rows; i++) {
            boolean win = true;
            for (int j = 0; j < myGameBoard.columns; j++) {
                if (myGameBoard.BoardArray[i][j] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }
        return false;
    }

    private boolean checkColumns(char symbol) {
        for (int j = 0; j < myGameBoard.columns; j++) {
            boolean win = true;
            for (int i = 0; i < myGameBoard.rows; i++) {
                if (myGameBoard.BoardArray[i][j] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }
        return false;
    }

    private boolean checkDiagonals(char symbol) {
        boolean diagonalWin = true;
        boolean antiDiagonalWin = true;
        for (int i = 0; i < myGameBoard.rows; i++) {
            if (myGameBoard.BoardArray[i][i] != symbol) diagonalWin = false;
            if (myGameBoard.BoardArray[i][myGameBoard.columns - 1 - i] != symbol) antiDiagonalWin = false;
        }
        return diagonalWin || antiDiagonalWin;
    }
}
