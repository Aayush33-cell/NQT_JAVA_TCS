package mathProblems;

public class productPrice {

    static int calculatePrice(int n){
        int ans = 1;
        while(n!=0){
            ans*=n%10;
            n=n/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(calculatePrice(5244));
    }

}
