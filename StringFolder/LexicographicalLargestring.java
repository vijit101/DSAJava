package StringFolder;

public class LexicographicalLargestring {
    public static void main(String[] args) {
        String Fruits[] = { "apple", "banana", "mango" };
        String comparisonStr = null;
        for (int i = 0; i < Fruits.length - 1; i++) {
            comparisonStr = Fruits[i];

            int stringcomp = comparisonStr.compareTo(Fruits[i + 1]);
            if (stringcomp < 0) {
                comparisonStr = Fruits[i + 1];
            }

        }
        if (comparisonStr != null) {
            System.out.println(comparisonStr);
        }
    }
}
