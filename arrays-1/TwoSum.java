import java.util.HashMap;
import java.util.Scanner;

class TwoSum{
     public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m = new HashMap<>(); 
        int more;
        int[] ans = new int[2];
        for(int i = 0 ;i < nums.length;i++){
            more = target-nums[i];
            if(m.containsKey(more)){
                ans[0]=m.get(more);
                ans[1]=i;
            }
            m.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            nums[i] = sc.nextInt();
        }
        int []ans = new int[2]; 
        ans=twoSum(nums,target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}