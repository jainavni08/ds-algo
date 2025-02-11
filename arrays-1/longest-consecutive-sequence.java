import java.util.*;
class Solution {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int max = 0;
        for(int n : nums){
            h.add(n);
        }
        for(int x : h){
            if(!h.contains(x-1)){
                //System.out.println("counting sequence for " + x);
                int i = 1;
                while(h.contains(x+i)){
                    //System.out.println("found " + (x+i));
                    i++;
                }
                max = Math.max(i,max); 
            }
            
        }
        return max;
    }
    public static void main(String []args){
        int []nums = {0,1,4,2,5,8,3,9,6,7,11};
        System.out.println(longestConsecutive(nums));
    }

}
