package arrayPractice;

public class secondMaxElement {

    static int secondMaxElement(int[] arr){
        if (arr.length<2) return -1;
        int max = Integer.MIN_VALUE,secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i]>=secondMax && arr[i]<max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {2};
        System.out.println(secondMaxElement(arr));
    }
}
