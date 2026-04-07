package OthelloGame;

public class Board {
    public BoardPiecesEnum[][] BoardArray;
    private static final int DEFAULT_BOARD_SIZE = 8;
    public int rows;
    public int columns;
    public int cellsFilled = 4;

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
        BoardArray = new BoardPiecesEnum[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                
                BoardArray[i][j] = BoardPiecesEnum.none;
            }
        }

        BoardArray[rows/2][columns/2] = BoardPiecesEnum.white;
        BoardArray[(rows/2)+1][columns/2] = BoardPiecesEnum.black;
        BoardArray[(rows/2)+1][(columns/2)+1] = BoardPiecesEnum.white;
        BoardArray[(rows/2)+1][(columns/2)+1] = BoardPiecesEnum.black;

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

