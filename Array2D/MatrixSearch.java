package Array2D;

public class MatrixSearch {

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        FindKey(mat, 16);
    }

    private static void FindKey(int[][] mymat, int key) {

        int row = 0, col = mymat[0].length - 1;
        while (row < mymat.length && col >= 0) {
            if (mymat[row][col] == key) {
                System.out.println("Key found " + row + " col:" + col);
                return;
            }

            else if (key < mymat[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found");

    }

}
