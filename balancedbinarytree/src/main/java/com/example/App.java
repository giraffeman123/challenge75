package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;        
        if(calculateHeight(root) == -1) return false;
        return true;
    }    

    public static int calculateHeight(TreeNode root){
        if(root == null)
            return 0;
        
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);

        if(leftHeight == -1 || rightHeight == -1) return -1;
        if(Math.abs(leftHeight - rightHeight) > 1) return -1;        

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
