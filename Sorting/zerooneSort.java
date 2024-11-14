public class zerooneSort {
    public static void main(String[] args) {
        int[] numbers = { 2, 1, 0, 1, 2, 0 };
        sort012(numbers, numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void sort012(int[] arr, int n) {
        // Your code goes here

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }

        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }

        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

}
