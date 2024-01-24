package com.example;

import java.util.Hashtable;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Hashtable<Character, Character> hsht = new Hashtable<>();
        hsht.put('(', ')');
        hsht.put('[', ']');
        hsht.put('{', '}');        

        for(int i = 0; i < s.length(); i++){
            if(hsht.get(s.charAt(i)) != null){
                stack.push(s.charAt(i));
            }else if(stack.isEmpty() || hsht.get(stack.pop()) != s.charAt(i)){                
                return false;
            }
        }
        
        if(stack.isEmpty())
            return true;
        else
            return false;  
    }    
}
