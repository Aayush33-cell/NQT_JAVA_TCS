package sortingSearching;
import java.util.*;
public class occurrenceCount {

    static int countOccurrenceOfTarget(int[] arr,int target){
        int start = 0,end = arr.length-1;
        int fp = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]== target) {
                fp = mid;
                end = mid-1;
            }
            else if (arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        int ep = -1;
        start = 0;
        end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ep = mid;
                start = mid+1;
            } else if (arr[mid]<target) {
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }

        if (fp==-1)
            return 0;

        return ep-fp+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(countOccurrenceOfTarget(arr,target));
    }
}
