package stringsPractice;
import java.util.*;
public class checkSandT {
    static boolean checkIfScontainsT(String s,String t){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!mp.containsKey(ch))
                mp.put(ch,1);
            else
                mp.put(ch,mp.get(ch)+1);
        }
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch))
                mp.put(ch,mp.get(ch)-1);
        }
        for(int x:mp.values()){
            if (x>0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aabc";
        String t = "abcd";
        System.out.println(checkIfScontainsT(s,t));
    }
}
