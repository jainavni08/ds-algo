package backtracking;
import java.util.*;
class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int l = nums.length;
        for(int i = 0 ;i < l ; i++){
            list.add(nums[i]);
        }
        permutation(0,list,result,l);
        return result;
    }

    public static void permutation(int fi,List<Integer> arr,List<List<Integer>> result , int l){
    if(fi == l){
        result.add(new ArrayList<>(arr));
    }
    for(int i = fi ; i < l ; i++){
        Collections.swap(arr, i, fi);
        permutation(fi+1,arr,result ,l);
        Collections.swap(arr, i, fi); //backtrack
    }
}
public static void main(String []args){
    int []nums = {1,2,3};
    List<List<Integer>> result = new ArrayList<>();
    result = permute(nums);
}

}
