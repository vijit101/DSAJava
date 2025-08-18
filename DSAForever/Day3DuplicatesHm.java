package DSAForever;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Day3DuplicatesHm{
    public static void main(String[] args) {
        
    }

    public static int[] EliminateDuplicates(int[] ary){
        HashMap map = new HashMap<Integer,Integer>();
        for (int i = 0; i < ary.length; i++) {
            map.put(ary[i],1 );
        }
        Set<Integer> mkeys = map.keySet();
        int[] ans = new int[mkeys.size()];
        int i = 0;
        for(Integer s : mkeys){
            ans[i] = s;
            i++;
        }
        return ans;
    }

    public ArrayList<Integer> removeDuplicatesFx(int[] ary){
        HashMap mapUniqueElements = new HashMap<Integer,Boolean>();
        ArrayList answer = new ArrayList<Integer>();
        for (int i = 0; i < ary.length; i++) {
            if(mapUniqueElements.containsKey(ary[i])){
                continue;
            }
            else{
                mapUniqueElements.put(ary[i], true);
                answer.add(ary[i]);
            }
        }
        return answer;
    } 
}