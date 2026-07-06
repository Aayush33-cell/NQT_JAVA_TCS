package stringsPractice;

import java.util.LinkedHashMap;

public class firstNonRepeatingElement {

    static int firstNonRepeatingElement(String str){
        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!lhm.containsKey(ch))
                lhm.put(ch,1);
            else
                lhm.put(ch,lhm.get(ch)+1);
        }
        for(char val:lhm.keySet()){
            if (lhm.get(val) == 1){
                return val;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "Aayush";
        char result = (char)firstNonRepeatingElement(str);
        System.out.println(result);
    }
}
