package stringsPractice;

import java.util.*;

public class charWithMaxFreq {

    static char charWithMaxFrequency(String s){
        if (s.length()<1)
            return ' ';
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        char max = s.charAt(0);
        int count = 0;
        for(Map.Entry<Character,Integer> x:mp.entrySet()){
            if (x.getValue()>count){
                max = x.getKey();
                count = x.getValue();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "aabbbdbdbdbdgshgdhgdjhsdghjgfdjgfgryteiytbytu";
        System.out.println(charWithMaxFrequency(s));
    }
}
