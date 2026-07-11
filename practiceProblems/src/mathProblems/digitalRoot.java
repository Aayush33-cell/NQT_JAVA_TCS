package mathProblems;

public class digitalRoot {

    static int findDigitalRoot(int n){
        int x =0;
        while(n>0 || x >9){
            if(n==0){
                n=x;
                x=0;
            }
            x+=n%10;
            n/=10;
        }
        return x;
    }

    static int findDigitalRootUsingMath(int n){
        if(n==0)
            return 0;
        return (1+(n-1))%9;
    }

    public static void main(String[] args) {
        System.out.println(findDigitalRoot(1111));
        System.out.println(findDigitalRootUsingMath(1111));
    }
}
