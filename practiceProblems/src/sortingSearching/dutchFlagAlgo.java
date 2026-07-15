package sortingSearching;
import java.util.*;
public class dutchFlagAlgo {

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortColors(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if (arr[mid]==0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                swap(arr,mid,high);
                high--;
            }
            else
                mid++;
        }
    }

    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            if (i!=arr.length-1)
                System.out.print(arr[i]+",");
            else System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        do{
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Before Sorting");
            printArr(arr);
            sortColors(arr);
            System.out.println();
            System.out.println("After Sorting");
            printArr(arr);
            System.out.println("Do you want to continue?(y=1/n=0)");
            count = sc.nextInt();
            if (count!=0 || count!=1)
                break;
        }while (count!=0);
    }
}
