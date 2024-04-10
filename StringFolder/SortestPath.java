package StringFolder;

import java.util.Scanner;

public class SortestPath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String mystr = sc.next(); // Add string as EWNS directions
        double Distance = CalcDistance(mystr);
        System.out.println(Distance);
    }

    public static double CalcDistance(String getStr) {
        double Dist = 0;
        Vector3 position = new Vector3();
        for (int i = 0; i < getStr.length(); i++) {
            if (getStr.charAt(i) == 'n' || getStr.charAt(i) == 'N') {
                position.y++;
            }
            if (getStr.charAt(i) == 's' || getStr.charAt(i) == 'S') {
                position.y--;
            }
            if (getStr.charAt(i) == 'e' || getStr.charAt(i) == 'E') {
                position.x++;
            }
            if (getStr.charAt(i) == 'w' || getStr.charAt(i) == 'W') {
                position.x--;
            }
        }
        System.out.println("x " + position.x + " y " + position.y);
        Dist = Math.sqrt(Math.pow(position.x, 2) + Math.pow(position.y, 2));

        return Dist;
    }
}

class Vector3 {
    int x;
    int y;
    int z;

    Vector3() {
        x = 0;
        y = 0;
        z = 0;
    }
}
