package DSAForever;

import java.util.HashMap;

public class Day4hashmapAnagram {
    public static void main(String[] args) {
        
    }

    public static boolean isAnagram(String s, String t) {
        if(s.equals(t)){
            return true;
        }
        int slen = s.length();
        if(slen == 0){
            return false;
        }
        if(slen == t.length()){
            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i <slen; i++) {
                Character keyati = s.charAt(i);
                if(map.containsKey(keyati)){
                    Integer val = map.get(keyati);
                    val++;
                    map.put(keyati,val);

                }else{
                    map.put(keyati, 1);
                }
            }

            for(int i =0 ; i<slen;i++){
                Character tkey = t.charAt(i);
                if(!map.containsKey(tkey)){
                    return false;
                }else{
                    Integer valt = map.get(tkey);
                    valt--;
                    if(valt<0){
                        return false;
                    }
                    map.put(tkey, valt);
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
