package ArraysCode;

import java.util.Vector;

public class RainWaterShb {
    public static void main(String[] args) {

        int[] waterArrywater = { 4, 2, 0, 6, 3, 2, 5 };
        int WaterTrappedAmt = WaterCalAlgo(waterArrywater);
        System.out.println("Water Trapped : " + WaterTrappedAmt);
    }

    public static int WaterCalAlgo(int[] waterArry) {
        // int[] ArraySubstraction = new int[waterArry.length];
        // set first value as first vlaue
        // ArraySubstraction[0] = waterArry[0];

        int waterlevel = 0;
        int valueArraysub = waterArry[0];
        int[] indexes = new int[10];
        int[] minValue = new int[10];
        indexes[0] = -1;
        minValue[0] = -1;
        int k = 0;
        int previousPostitiveValue = -1;
        int previousPositiveIndex = -1;
        for (int i = 0; i < (waterArry.length - 1); i++) {
            // ArraySubstraction[i] = waterArry[i + 1] - waterArry[i];
            // ArraySubstraction[i] = waterArry[i + 1] - waterArry[i];

            if (/* ArraySubstraction[i] */ valueArraysub > 0) {
                // if +ve then a peak checking two previous peaks and saving valley indexes
                if (previousPostitiveValue > 0) {
                    if (previousPostitiveValue < waterArry[i]) {
                        minValue[k] = waterArry[i];
                        indexes[k] = i;
                        minValue[k + 1] = -1;
                        indexes[k + 1] = -1;
                        k++;
                    } else {
                        minValue[k] = waterArry[i];
                        indexes[k] = i;
                        minValue[k + 1] = -1;
                        indexes[k + 1] = -1;
                        k++;
                    }
                } else {
                    previousPostitiveValue = waterArry[i];
                    previousPositiveIndex = waterArry[i];
                }

            }
            valueArraysub = waterArry[i + 1] - waterArry[i];// check if first time valarraysub greater than 0
        }

        for (int i = 0; i < waterArry.length; i++) {
            int m = 0; // to control the valley range and index range
            if (minValue[k] != -1) {
                if (i < indexes[k]) {
                    // checking if index in a certain range of valley then use a min value
                    waterlevel += (minValue[m] - waterArry[i]);
                } else {
                    m++;
                }
            } else {
                break;
            }

        }
        return waterlevel;
    }
}
