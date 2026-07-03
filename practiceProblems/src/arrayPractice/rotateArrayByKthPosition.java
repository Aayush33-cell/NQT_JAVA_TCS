package arrayPractice;

public class rotateArrayByKthPosition {

    static void reverse(int[] arr,int start,int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] arr,int k){
        k = k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8,9,10};
        System.out.println("Before Rotate");
        for(int x:arr)
            System.out.print(x+",");
        rotate(arr,3);
        System.out.println();
        System.out.println("After Rotate");
        for (int x:arr)
            System.out.print(x+",");
    }
}
