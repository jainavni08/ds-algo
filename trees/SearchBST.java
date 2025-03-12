package trees;
 class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
 }
    
public class SearchBST {
       public TreeNode searchBST(TreeNode root, int val) {
           while(root != null){
               if(root.val == val){
                   return root;
               }else if(root.val < val){
                   root= root.right;
               }else{
                   root = root.left;
               }
           }
           return root;
       }

       public static TreeNode create(int[] arr){
        TreeNode root = new TreeNode(arr[0]);
        return root;
       }
           
   }
