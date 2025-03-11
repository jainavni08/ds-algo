import java.util.Arrays;

public class LeetCode2344 {
    public static int minOperations(int[] nums, int[] numsDivide) {
        int g = gcdOfArray(numsDivide);
        //System.out.println(g);
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length; i++){
            if(g % nums[i] == 0) break;
            else{
                count++;
            }
        }
        if(count == nums.length) return -1;
        return count;
    }
    public static int minNum(int []arr,int k){
        int l = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i = k; i< l;i++){
            if(arr[i] == k) continue;
            min = Math.min(min,arr[i]);
        }
        return min;
    }

    public static int gcd(int a,int b){
        if(b==0) return a;
        if(b>a) return gcd(a,b%a);
        else return gcd(b,a%b);
    }

    public static int gcdOfArray(int []arr){
        if(arr.length == 1) return arr[0];
        int x = gcd(arr[0],arr[1]);
        for(int i = 2;i<arr.length;i++){
             x = gcd(arr[i],x);
        }
        return x;
    }
    public static void main(String[] args){
        int nums[] = {2,3,4,2,3};
        int numsDivide[] = {9,6,9,3,15};
        int count = minOperations(nums, numsDivide);
        System.out.println(count);
    }
}

