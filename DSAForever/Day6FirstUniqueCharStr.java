package DSAForever;

public class Day6FirstUniqueCharStr {
    public static void main(String[] args) {
        
    }

    public int firstUniqChar(String s) {
        int n = s.length();
        if (n == 0) return -1;
        if (n == 1) return 0;

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j =0; j < n; j++) { // run for all j and check count reason is the when left to right is checked in say aabb a count is 1 but second a count will be 1 in this way 
                if (i!=j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1;
    }
}
