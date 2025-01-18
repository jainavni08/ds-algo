import java.util.*;
class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0 ;i < nums.length ; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    } 
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            System.out.println("Enter element : ");
            nums[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int k = removeElement(nums,val);
        for(int i =0;i<k;i++){
            System.out.print(nums[i] + " ");
        }
    } 
}