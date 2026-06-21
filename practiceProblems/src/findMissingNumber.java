public class findMissingNumber {

    static int missingNumber(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum+=arr[i];
        }
        int ans = sum-arrSum;
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = {1,2,4,5,6,7,8,9};
        System.out.println(missingNumber(ans));
    }
}
