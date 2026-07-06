package stringsPractice;

import java.util.*;

public class removeDuplicate {

    static void removeDuplicate(String s){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
//        HashSet<String> hs = new HashSet<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));
            if (!lhs.contains(ch)){
                lhs.add(ch);
            }
        }
        // Iterate over the LinkedHashSet and append each unique character to ans
        for (String ch : lhs) {
            ans.append(ch);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        removeDuplicate("aabbccdd");
    }
}
