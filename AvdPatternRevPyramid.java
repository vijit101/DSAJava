public class AvdPatternRevPyramid {
    public static void main(String[] args) {
        revpyramid(4, 4);
    }

    private static void revpyramid(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (j >= row - (i + 1)) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
