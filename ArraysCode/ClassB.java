package ArraysCode;

public class ClassB {
    public static void main(String[] args) {
        // Calling the static function from ClassA
        int[] result = ClassA.myStaticFunction();
        int i = 0;
        // Accessing the returned array elements
        while (i < result.length) {
            System.out.println(result[i]);
            i++;
        }
    }
}