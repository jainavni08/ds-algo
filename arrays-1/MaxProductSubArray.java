import java.util.*;
class MaxProductSubArray {
    public static int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] >= 0){
                max = Math.max(nums[i],max*nums[i]);
                min = Math.min(nums[i],min*nums[i]);
                }
            else{
                int temp = max;
                max = Math.max(nums[i],min*nums[i]);
                min = Math.min(nums[i],temp*nums[i]);
            }
            
            res = Math.max(res,max);
        }
            return res;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxProduct(nums));
    }
}
