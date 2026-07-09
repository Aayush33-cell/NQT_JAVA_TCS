package mathProblems;

import java.util.*;

public class calculateDiscount {

    static double discountCalculator(int c){
        double ans = 0,discount = 0;
        if (c==1000) {
            discount = c * (5.0 / 100.0);
            ans = c-discount;
        }
        else if (c>1001 && c<=5000) {
            discount += c * (10.0 / 100.0);
            ans = c-discount;
        }
        else if (c>5000) {
            discount += c * (15.0 / 100.0);
            ans = c-discount;
        }
        else
            return c;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c<0)
            System.out.println("Error");
        else
            System.out.println(discountCalculator(c));;
    }

}
