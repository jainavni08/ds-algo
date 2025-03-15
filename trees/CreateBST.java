import java.util.*;
public class CreateBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode() {}
        
        TreeNode(int val) {
            this.val = val;
        }
        
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    // Method to create a binary tree from an array
    public static TreeNode create(Integer[] nums) {
        if (nums == null || nums.length == 0) return null;  // Fix null check order

        TreeNode root = new TreeNode(nums[0]);
        int index = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while (index < nums.length) {
            TreeNode curr = q.poll();
            
            // Left child
            if (nums[index] != null) {
                curr.left = new TreeNode(nums[index]);
                q.offer(curr.left);
            }
            index++;
            
            // Right child
            if (index < nums.length && nums[index] != null) {
                curr.right = new TreeNode(nums[index]);
                q.offer(curr.right);
            }
            index++;
        }
        return root;
    }

    // Level-order traversal method to print the tree
    public static void traversal(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print(curr.val + " ");
            if (curr.left != null) {
                q.offer(curr.left);
            }
            if (curr.right != null) {
                q.offer(curr.right);
            }
        }
        System.out.println();  // For better formatting of output
    }

    public static void main(String[] args) {
        Integer[] nums = {3, 2, null, 4, 5};  // Input array
        TreeNode root = create(nums);  // Create the tree
        traversal(root);  // Print the tree using level-order traversal
    }
}

