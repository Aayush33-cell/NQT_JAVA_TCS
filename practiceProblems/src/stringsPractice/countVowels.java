package stringsPractice;

public class countVowels {

    static int[] countVowels(String s){
        int vowelCount = 0,consonantCount = 0;
        int i = 0;
        while (i<s.length()){
            char ch = s.charAt(i);
            if (ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                char chLower = Character.toLowerCase(ch);
                if (chLower=='a' || chLower=='e' || chLower=='i' || chLower=='o' || chLower=='u')
                    vowelCount++;
                else
                    consonantCount++;
            }
            i++;
        }
        int[] ans = {vowelCount,consonantCount};
        return ans;
    }

    public static void main(String[] args){
        String s = "My name is Aayush Tiwary";
        int[] ans = countVowels(s);
        System.out.println("Vowels count = "+ans[0]+"\nConsonant Count = "+ans[1]);
    }

}
