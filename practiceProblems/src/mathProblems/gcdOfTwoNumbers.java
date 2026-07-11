package mathProblems;

public class gcdOfTwoNumbers {

//  Using Iteration
    static int gcd(int a,int b){
        int rem=1,ans=1;
        while (rem>0){
            rem = a%b;
            a = b;
            b = rem;
            if (rem!=0)
                ans=rem;
        }
        return ans;
    }

//    Using Recursion
    static int gcdRecursion(int a,int b){
        if(a==0)
            return b;
        return gcdRecursion(b%a,a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(781,484));
        System.out.println(gcdRecursion(781,484));
    }
}
