package arrayPractice;

import java.util.HashMap;

public class twoSum {

    static int twoSumUsingMap(int[] arr,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = k-arr[i];
            if (hm.containsValue(complement))
                return hm.
        }
    }

    public static void main(String[] args) {

    }
}
