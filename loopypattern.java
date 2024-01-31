public class loopypattern {
    public static void main(String[] args) {
        LoopPrintRecursion(5);

    }

    private static void LoopPrintRecursion(int n) {

        if (n == 0) {
            // System.out.print("*");
            return;
        }
        // System.out.println("Iteration" + n);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        LoopPrintRecursion(n - 1);

    }
}
