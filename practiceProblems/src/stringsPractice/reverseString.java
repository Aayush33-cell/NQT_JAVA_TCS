package stringsPractice;
public class reverseString {

    static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = 0,j = s.length()-1;
        while(i<=j){
            char temp = s.charAt(i);
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return ""+sb;
    }

    public static void main(String[] args) {
        String s = "Reverse";
        char[] ch = s.toCharArray();
    }
}
