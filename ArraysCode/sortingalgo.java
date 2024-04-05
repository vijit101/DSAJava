package ArraysCode;

public class sortingalgo {
    public static void main(String[] args) {

    }

    public static void Sorter(int[] PassArray) {
        for (int i = 0; i < PassArray.length - 1; i++) {
            if (PassArray[i + 1] < PassArray[i]) {
                int temp = PassArray[i];
                PassArray[i] = PassArray[i + 1];
                PassArray[i + 1] = temp;
            }

        }

    }
}
