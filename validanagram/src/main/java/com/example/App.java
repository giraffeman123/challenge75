package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);

        for(int i = 0; i < t.length(); i++)
            freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i), 0) - 1);

        for(Map.Entry<Character, Integer> entry : freq.entrySet())
            if(entry.getValue() != 0)
                return false;

        return true;
    }
}
