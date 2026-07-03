package arrayPractice;

import java.util.HashMap;

public class countFrequency {

    static int[] frequencyArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max = arr[i];
        }
        int[] ans = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,3,4,4,5,6,6,6,7,7,7,8,9,9,0,0};
//        int[] ans = frequencyArray(arr);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(i+" = "+ans[i]);
//        }

        HashMap<Integer,Integer>h = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        System.out.println(h);
    }
}
