package ArraysCode;

public class rainwater {
    public static void main(String[] args) {

        int[] waterArrywater = { 4, 2, 0, 6, 3, 2, 5 };
        int WaterTrappedAmt = CalWater(waterArrywater);
        System.out.println("Water Trapped : " + WaterTrappedAmt);
    }

    public static int CalWater(int[] waterArry) {
        int amtwater = 0;
        int minWaterHt = 0;
        // int[] MinWaterHeightArray = new int[waterArry.length];
        for (int i = 0; i < waterArry.length; i++) {
            int right = FindRightMax(waterArry, i);
            int left = FindLeftMax(waterArry, i);
            System.err.println("Max for i : " + i + " val " + waterArry[i] + " right is " + right + " Left is " + left);
            if (left < right) {
                minWaterHt = left;
                // MinWaterHeightArray[i] = left;
            } else {
                minWaterHt = right;
                // MinWaterHeightArray[i] = Right;
            }

            amtwater += (minWaterHt - waterArry[i]);

        }
        return amtwater;
    }

    public static int FindRightMax(int[] waterArry, int indexOfval) {
        int maxRight = -1;
        for (int i = indexOfval; i < waterArry.length; i++) {
            if (waterArry[i] > maxRight) {
                maxRight = waterArry[i];
            }
        }
        return maxRight;
    }

    public static int FindLeftMax(int[] waterArry, int indexOfval) {
        int maxLeft = -1;
        for (int j = indexOfval; j >= 0; j--) {
            if (waterArry[j] > maxLeft) {
                maxLeft = waterArry[j];
            }
        }
        return maxLeft;
    }

}
