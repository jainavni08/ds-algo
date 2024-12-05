import java.util.Scanner;
class Solution {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int n : nums){
            if(count <= 0){
                candidate = n;
            }
           if(candidate == n){
            count++;
           }else{
            count --;
           }
        }
        return candidate;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(majorityElement(nums));
    }
}
