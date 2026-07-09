package mathProblems;

public class armstrongNumber {

    static boolean armstrongNumberCheck(int n){
        int a = n;
        int count = 0;
        while (a !=0){
            count++;
            a = a /10;
        }
        int m,ans=0;
        int comp = n;
        while (n!=0){
            m = n%10;
            int powValue=1;
            for(int i =0;i<count;i++){
                powValue*=m;
            }
            ans += powValue;
            n/=10;
        }
        return ans == comp;
    }

    public static void main(String[] args) {
        System.out.println(armstrongNumberCheck(153));
    }
}
