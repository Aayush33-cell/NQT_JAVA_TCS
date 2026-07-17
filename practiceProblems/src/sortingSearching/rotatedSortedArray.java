package sortingSearching;
import java.util.*;
public class rotatedSortedArray {
    static int binarySearchInRotatedSortedArray(int[] arr,int target){
        int start = 0,end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid] == target)
                return mid;
            if(arr[mid]>=arr[start]){
                if (target>=arr[start] && target<arr[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else {
                if (target>arr[mid] && target<=arr[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearchInRotatedSortedArray(arr,target));
    }
}
