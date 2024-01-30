package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //[4,2,7,1,3,6,9]
        TreeNode root1nth = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode root1nth2 = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        TreeNode root = new TreeNode(4, root1nth, root1nth2);

        TreeNode result = invertTree(root);
        System.out.println(result);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
                    
        if(root.left == null && root.right == null)
            return root;
        else{
            TreeNode intermediate = root.left;
            root.left = root.right;
            root.right = intermediate;

            root.left = invertTree(root.left);
            root.right = invertTree(root.right);
            return root;
        }
    }    
}
