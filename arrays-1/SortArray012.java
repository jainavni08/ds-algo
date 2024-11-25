import java.util.*;

class SortArray012{
    public static void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                count0+=1;
            }else if(nums[i] == 1){
                count1+=1;
            }
        }

        for(int i = 0;i<nums.length;i++){
            if(i < count0){
                nums[i] = 0;
            }else if(i >= count0 && i < count1+count0){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] nums = new int[len];
        for(int i =0;i<len;i++){
            nums[i] = sc.nextInt();
        }
        sortColors(nums);
        for(int i =0;i<len;i++){
            System.out.print(nums[i]);
        }
    }

}
