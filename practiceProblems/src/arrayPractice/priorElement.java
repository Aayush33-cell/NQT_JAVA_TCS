package arrayPractice;

import java.util.Scanner;

public class priorElement {

    static int priorElementCount(int[] arr){
        int count = 1,i=0;
        while (i<arr.length-1){
            if (arr[i]<arr[i+1])
                count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(priorElementCount(arr));
    }
}
