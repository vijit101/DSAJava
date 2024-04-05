package ArraysCode;

public class pairsArray {
    public static void main(String[] args) {
        int[] Arry = { 10, 20, 2, 4, 100, 6, 8, 9, 5 };
        pairprint(Arry);
    }

    public static void pairprint(int[] Myarray) {
        int arylen = Myarray.length;
        for (int i = 0; i < arylen; i++) {
            for (int j = i + 1; j < arylen; j++) {
                System.out.print("Pair:" + Myarray[i] + "," + Myarray[j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
