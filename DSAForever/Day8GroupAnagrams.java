package DSAForever;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day8GroupAnagrams {

    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams2(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Step 1: Sort the string to create the key
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // Step 2: Insert into map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

// Step 3: Convert map values to result list
        return new ArrayList<>(map.values());

    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> answerLst = new ArrayList<>();
        int strlen = strs.length;
        if (strlen == 0) {
            return answerLst;
        }
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < strlen; i++) {
            lst.add(strs[i]);
        }

        for (int i = 0; i < lst.size(); i++) {
            List<String> lstNew = new ArrayList<>();
            lstNew.add(lst.get(i));
            for (int j = i + 1; j < lst.size(); j++) {
                if (isAnagram(lst.get(i), lst.get(j))) {
                    lstNew.add(lst.get(j));
                    lst.remove(j);
                }
            }

            answerLst.add(lstNew);
        }
        return answerLst;

    }

    boolean isAnagram(String first, String second) {
        char[] fArr = first.toCharArray();
        char[] sArr = second.toCharArray();

        Arrays.sort(fArr);
        Arrays.sort(sArr);

        return Arrays.equals(fArr, sArr);
    }

}
