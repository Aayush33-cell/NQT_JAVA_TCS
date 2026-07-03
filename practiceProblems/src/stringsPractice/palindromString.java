package stringsPractice;

import java.util.Scanner;

public class palindromString {

    static boolean isPalindromeString(String s){
        int i =0,j=s.length()-1;
        while(i<=j){
            if (s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n;
        do {
            System.out.println("Enter the String to check");
            String s = sc.nextLine();

            if (isPalindromeString(s))
                System.out.println("Palindromic String");

            else
                System.out.println("Not Palindromic String");

            System.out.println("Do you want to continue(y/n)");
            n = sc.next().charAt(0);

            sc.nextLine();
        }while (n!='n') ;
    }

}
