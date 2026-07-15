package sortingSearching;

public class bubbleSort {

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSortPractice(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<arr[j])
                    swap(arr,i,j);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,6,7,3,1,2};
        bubbleSortPractice(arr);
        for(int x:arr)
            System.out.print(x+",");
    }
}
