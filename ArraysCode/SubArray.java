package ArraysCode;

public class SubArray {

    public static void main(String[] args) {
        int[] Arry = { 10, 20, 2, 4, 5, 9 };
        printSubArrays(Arry);

    }

    public static void printSubArrays(int[] Myarray) {
        int arylen = Myarray.length;
        String SubStr;
        int sumSub;
        for (int i = 0; i <= arylen; i++) {
            if (i == arylen) {
                System.out.println(Myarray[arylen - 1]);
                break;
            }
            int Valueati = Myarray[i];
            SubStr = Integer.toString(Valueati);
            sumSub = Valueati;
            System.out.println("Substring for " + Valueati + "\n");
            for (int j = i + 1; j < arylen; j++) {
                SubStr += ";" + Integer.toString(Myarray[j]);
                sumSub += Myarray[j];
                System.out.println(SubStr + " sum is " + sumSub);
            }
            System.out.println(" ");
        }
    }
}
