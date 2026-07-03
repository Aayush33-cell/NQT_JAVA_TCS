package arrayPractice;

public class moveZerosToEnd {

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void moveZeroesToEnd(int[] arr){
        int insertPos = 0,i = 0;
        while (i <arr.length){
            if (arr[insertPos]!=0) insertPos++;
            if (arr[i] == 0) i++;
            else {
                swap(arr,insertPos,i);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0};
        moveZeroesToEnd(arr);
        for(int x:arr)
            System.out.print(x+",");
    }
}
