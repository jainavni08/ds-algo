import java.util.*;
class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max  = 0;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1){
                count++;
            }else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        return Math.max(max,count);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            System.out.println("Enter element:");
            nums[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}