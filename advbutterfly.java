public class advbutterfly {
    public static void main(String[] args) {
        avdPattern(8, 8);
    }

    public static void avdPattern(int row, int col) {
        int midwayrow = row / 2;
        int midwaycol = col / 2;
        int colcontrol = midwaycol;

        for (int i = 1; i <= row; i++) {
            // System.out.print("*");
            for (int j = 1; j <= col; j++) {
                if (i <= midwayrow) {
                    if (i == midwayrow) {
                        System.out.print("*");
                    } else if (j < midwaycol && i < midwayrow) {
                        // using i< midwayrow so it does not interfere with i == midrow logic
                        if (j <= i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else if (j > midwaycol && i < midwayrow) {
                        if (j > row - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }

                }
                if (i >= midwayrow + 1) {
                    if (i == midwayrow + 1) {
                        System.out.print("*");
                    } else if (j <= midwaycol && i > midwayrow + 1) {
                        // j runs from 0 - 4
                        if (j < colcontrol) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");
                        }
                    } else if (j > midwaycol && i > midwayrow + 1) {
                        // j runs 5-8
                        if (j >= i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                // j = col prints border for butterfly and row/2 for centre

            }
            System.out.println();
            if (i > midwayrow + 1) {
                colcontrol--;
            }
        }
    }

}
