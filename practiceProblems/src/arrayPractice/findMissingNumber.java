package arrayPractice;

public class findMissingNumber {

    static int missingNumber(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int arrSum = 0;
        for (int i :arr) {
            arrSum+=i;
        }
        return sum-arrSum;
    }

    public static void main(String[] args) {
        int[] ans = {1,2,4,5,6,7,8,9};
        System.out.println(missingNumber(ans));
    }
}
