package stringsPractice;

public class countA {

    static int countAInString(String s){
        int count = 0,ans = 0;
        int i = 0;
        while (i<s.length()){
            char curr = s.charAt(i);
            if (curr=='a'){
                count++;
            }
            else{
                if (ans<count)
                    ans = count;
                count = 0;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "bbbaaababa";
        System.out.println(countAInString(s));
    }
}
