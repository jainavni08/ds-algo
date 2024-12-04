import java.util.*;
class Solution {
    public static int missingNumber(int[] nums) {
        int l = nums.length;
        int sum1 = l * (l + 1) / 2;
        int sum2 = 0;
        for(int i = 0 ; i < l ; i++){
            sum2 += nums[i];
        }
        return sum1-sum2;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(missingNumber(nums));
    }

}
