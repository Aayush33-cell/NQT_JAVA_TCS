package arrayPractice;

import java.util.HashMap;

public class twoSum {

    static int[] twoSumUsingMap(int[] arr,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = {-1};
        for (int i = 0; i < arr.length; i++) {
            int complement = k-arr[i];
            if (!hm.containsKey(complement)){
                hm.put(arr[i],i);
            }
            else {
                ans = new int[]{hm.get(complement),i};
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8};
        int[] ans = twoSumUsingMap(arr,12);
        for(int x:ans)
            System.out.print(x+",");
    }
}
