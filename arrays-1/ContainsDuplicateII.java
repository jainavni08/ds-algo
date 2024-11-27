import java.util.HashSet;
import java.util.Scanner;
class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(s.contains(nums[i])) {
                return true;
            }
            s.add(nums[i]);
            if (i - k >= 0) {
                s.remove(nums[i - k]);
            }
        }

        return false;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(containsNearbyDuplicate(nums,target));
    }
}