package mathProblems;

public class fibonacciSeries {
//    Using Loops
    static void printFibonacciSeries(int n){
        int first = 0,second = 1,next;
        for (int i = 0; i <n; i++) {
            if (i==n-1)
                System.out.print(first);
            else
                System.out.printf("%d,",first);
                next = second+first;
                first = second;
                second = next;
        }
    }

//    Using Recursion
    static int fibonacciRecursive(int n){
        if (n==0 || n==1)
            return n;
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }

    public static void main(String[] args) {
//        printFibonacciSeries(10);
        for(int i = 0;i<10;i++)
            System.out.print(fibonacciRecursive(i)+",");
    }
}
