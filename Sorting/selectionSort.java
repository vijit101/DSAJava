package Sorting;

public class selectionSort {

    public static void main(String[] args) {
        // int[] Myary = { 120, 1, 10, 360, 5, 3, 6, 2, 100 };
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
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void selectionSort(int[] arr) {
        // Your code goes here
        int min;
        int indx = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    if (min >= arr[j]) {
                        min = arr[j];
                        indx = j;
                    }
                } else if (arr[j] > arr[j + 1]) {
                    if (min >= arr[j + 1]) {
                        min = arr[j + 1];
                        indx = j + 1;
                    }
                }
            }
            int temp = arr[i];
            arr[i] = arr[indx];
            arr[indx] = temp;
        }
    }

}
