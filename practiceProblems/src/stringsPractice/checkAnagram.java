package stringsPractice;

import java.util.HashMap;

public class checkAnagram {

//    Using HashMap
    static boolean anagramCheck(String a,String b){
        if (a.length() != b.length())
            return false;
        HashMap<Character,Integer> hsa = new HashMap();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (!hsa.containsKey(ch)){
                hsa.put(ch,1);
            }
            else
                hsa.put(ch,hsa.get(ch)+1);
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (!hsa.containsKey(ch)){
                return false;
            }
            else
                hsa.put(ch,hsa.get(ch)-1);
        }
        for (int x:hsa.values()){
            if (x>0)
                return false;
        }
        return true;
    }

//    Using Array
    static boolean checkAnagrams(String a,String b){
        if (a.length() != b.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }
        for(int val:count){
            if (val!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "aabbcc";
        String b = "acbacb";
        if (checkAnagrams(a,b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagrams");
    }
}
