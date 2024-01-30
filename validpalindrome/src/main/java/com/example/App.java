package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //"amanaplanacanalpanama"
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromeOptimized(s));
    }

    public static boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse += s.charAt(i);
        }

        return reverse.equals(s);
    }    

    public static boolean isPalindromeOptimized(String s) {
        if(s.isEmpty())
            return true;
        
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        while(leftPointer <= rightPointer){
            if(!Character.isLetterOrDigit(s.charAt(leftPointer))){
                leftPointer++;
            }else if (!Character.isLetterOrDigit(s.charAt(rightPointer))){
                rightPointer--;
            }else{
                if(Character.toLowerCase(s.charAt(leftPointer)) != Character.toLowerCase(s.charAt(rightPointer)))
                    return false;
                else{
                    leftPointer++;
                    rightPointer--;
                }
            }
        }
        return true;
    }
}
