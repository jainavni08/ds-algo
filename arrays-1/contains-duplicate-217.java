import java.util.*;
class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int n : nums){
            if(s.contains(n)) return true;
            else s.add(n);
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(containsDuplicate(nums));
    }

}