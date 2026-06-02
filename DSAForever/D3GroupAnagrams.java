package DSAForever;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D3GroupAnagrams {

    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagramsSorting(String[] strs) {
        Map<String, List<String>> mymap = new HashMap<>();
        for (String str : strs) {
            char[] strcharTransformed = str.toCharArray();
            Arrays.sort(strcharTransformed);
            String key = new String(strcharTransformed);
            // do not use .tostring as arrays.toString has differet implementation
            mymap.putIfAbsent(key, new ArrayList<>());
            mymap.get(key).add(str);
        }
        return new ArrayList<>(mymap.values());

//         List<List<String>> ans = new ArrayList<>();
// for(List<String> group : mymap.values()) {
//     ans.add(group);
// }
// return ans;
//or
// List<List<String>> ans = new ArrayList<>();
// for(String key : mymap.keySet()) {
//     ans.add(mymap.get(key));
// }
// return ans;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mymap = new HashMap<>();

        for (String str : strs) {
            char[] strcharTransformed = str.toCharArray();
            int[] freq = new int[26];
            String fKey = new String();
            for (int i = 0; i < strcharTransformed.length; i++) {
                freq[strcharTransformed[i]- 'a']++;

            }
            StringBuilder buildKey = new StringBuilder();
            for(int i=0;i<freq.length;i++){
                buildKey.append('#');
                // adding # as {21,1} and {2,1,1} can become say key 
                buildKey.append(freq[i]);
            }
            fKey = buildKey.toString();
            mymap.putIfAbsent(fKey,new ArrayList<>());
            mymap.get(fKey).add(str);

        }
        return new ArrayList<>(mymap.values());
    }

    public List<List<String>> groupAnagrams1(String[] strs) {

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

}
