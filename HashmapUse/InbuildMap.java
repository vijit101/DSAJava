package HashmapUse;

import java.util.HashMap;
import java.util.Set;

public class InbuildMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("def", 2);
        if(map.containsKey("abc")){
            System.out.println(map.get("abc"));
        }
        map.remove("def");
        
        Set<String> keys =  map.keySet();
        for(String s:keys){
            System.out.println(s);
        }
    }

}
