package mathProblems;

public class factorial {

//    Using Iteration
    static int findFactorial(int n){
        int ans = 1;
        for(int i =1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }

//    Using Recursion
    static int findFact(int n){
        if (n==0 || n==1)
            return 1;
        return n*findFact(n-1);
    }

    public static void main(String[] args) {
//        System.out.println(findFactorial(5));
    }
}
