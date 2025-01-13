package TicTacToeJavaproj;

public class Board {
    public char[][] BoardArray;
    private static final int DEFAULT_BOARD_SIZE = 3;
    public int rows;
    public int columns;
    public int cellsFilled;

    // Default Constructor
    public Board() {
        this(DEFAULT_BOARD_SIZE, DEFAULT_BOARD_SIZE);
    }

    // Parameterized Constructor
    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        initializeBoard(rows, columns);
    }

    // Initializes the board
    private void initializeBoard(int rows, int columns) {
        BoardArray = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                BoardArray[i][j] = ' ';
            }
        }
    }

    // Overloaded method to reset board with custom size
    public void EmptyBoardSetup(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        initializeBoard(rows, columns);
    }

    // Overloaded method to reset board to default size
    public void EmptyBoardSetup() {
        EmptyBoardSetup(DEFAULT_BOARD_SIZE, DEFAULT_BOARD_SIZE);
    }
}
