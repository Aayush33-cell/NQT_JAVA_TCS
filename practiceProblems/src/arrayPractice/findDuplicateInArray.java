package arrayPractice;

public class findDuplicateInArray {

    static int findDuplicate(int[] arr){
        int slow = arr[0],fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while (slow != fast);
        fast = arr[0];
        while (slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,7,8,9};
        System.out.println("Repeating Element is "+findDuplicate(arr));
    }
}
