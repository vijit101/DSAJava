package ArraysCode;

public class LargestNoArray {

    public static void main(String[] args) {

        int min = Integer.MIN_VALUE;
        int[] Aray = { 1, 200000, 2, 4, 6, 4, 8, 9, 0, 100, };
        for (int i = 0; i < Aray.length; i++) {
            if (Aray[i] > min) {
                min = Aray[i];
            }
        }
        System.out.println("the max number in the array is " + min);
    }

}
