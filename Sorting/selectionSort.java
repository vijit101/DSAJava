public class selectionSort {

    public static void main(String[] args) {
        // int[] Myary = { 120, 1, 10, 360, 5, 3, 6, 2, 100 };
        int[] inverNums = { 3, 2, 11, 5, 1 };
        int[] numbers = {
                110, 78, 109, 23, 73, 179, 276, 183, 257, 252, 292, 284,
                340, 181, 160, 205, 116, 322, 73, 126, 340, 326, 10, 51,
                48, 184, 197, 15, 237, 288, 266, 170, 16, 34, 220, 293,
                170, 333, 188, 144, 194, 262, 9, 223, 305, 64, 277, 109,
                36, 76, 234, 166, 6, 248, 314, 116, 296, 109, 22, 135,
                240, 72, 264, 80, 320, 174, 130, 132, 251, 233, 312, 94,
                271, 161, 140, 66, 214, 155, 338, 316, 94, 58, 218, 329,
                215, 299, 143, 120, 273, 84, 227, 223, 102, 294, 279, 5,
                27, 292, 44, 169, 99, 144, 93, 286, 10, 261, 4, 80, 187,
                8, 175
        };
        selectionSort(numbers);
        System.out.println(getInversions(inverNums, 0));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void selectionSort(int[] arr) {
        // Your code goes here

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public static int getInversions(int[] arr, int n) {
        // Your code goes here
        int sumInversionNum = 0;// when swapping we update it with a difference of indices of swapped nums
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            sumInversionNum += (min - i);
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        return sumInversionNum;
    }

}
