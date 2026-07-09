package mathProblems;

import java.util.Scanner;

public class bitToggling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numBits = (int)(Math.log(n) / Math.log(2))+1;
        int mask = (1<<numBits) - 1;
        int result = n ^ mask;
        System.out.println(result);
    }
}
