package DSAForever;

import java.util.Arrays;

public class D6PermutationInString {

    public static void main(String[] args) {

    }

    public boolean checkInclusion(String s1, String s2) {
        boolean ans = false;
        int[] freq = new int[26];
        int end = 0;
        for (char elem : s1.toCharArray()) {
            freq[elem-'a']++;
        }

        int s2Len = s2.length();
        char[] s2CharArray = s2.toCharArray();
        int[] freqs2 = new int[26];

        for (int i = 0; i < s2Len; i++) {
            
            char EndthChar = s2CharArray[end];
            while(freqs2[EndthChar-'a'] < freq[EndthChar -'a'] && freq[EndthChar -'a'] != 0){
                freqs2[EndthChar -'a']++;
                end++;
                if(Arrays.equals(freq, freqs2)){
                    ans = true;
                }
            }
            

            // might need to do soemthing where i do -1 from freq and then i ++ that way i can use end but not miss any combos 
            freqs2[s2CharArray[i] - 'a'] -- ; 
        }
        return ans;
    }
    
}
