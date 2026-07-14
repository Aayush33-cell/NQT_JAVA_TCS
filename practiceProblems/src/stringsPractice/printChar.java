package stringsPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class printChar {

    static void printCharAppearMoreThanOnce(String s){
        LinkedHashMap<Character,Integer> mp = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!mp.containsKey(ch))
                mp.put(ch,1);
            else
                mp.put(ch,mp.get(ch)+1);
        }
        for(Map.Entry<Character,Integer> x:mp.entrySet()){
            if (x.getValue()>1)
                System.out.print(x.getKey()+",");
        }
    }

    public static void main(String[] args) {
        String s = "abbcdddeeef";
        printCharAppearMoreThanOnce(s);
    }
}
