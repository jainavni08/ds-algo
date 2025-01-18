import java.util.*;
class Solution {
    public static int removeDuplicates(int[] nums) {
        int val = nums[0];
        int k = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
                val = nums[i];
            }
        }
        return k;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            System.out.println("Enter element : ");
            nums[i] = sc.nextInt();
        }
        int k =removeDuplicates(nums);
        for(int i =0;i<k;i++){
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }   
}
