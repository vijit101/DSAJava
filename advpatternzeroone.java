public class advpatternzeroone {
    public static void main(String[] args) {
        zero1s(5, 5);
    }

    private static void zero1s(int row, int col) {
        int num = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                if (num == 0) {
                    num = 1;
                } else {
                    num = 0;
                }
            }
            System.out.println(" ");
            if (i % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }
        }

    }
}
