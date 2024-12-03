import java.util.Scanner;
class Solution {
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0 ; i < nums.length ; i++ ){
           xor = xor ^ nums[i];
        }
        return xor;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(singleNumber(nums));
        
    }
}