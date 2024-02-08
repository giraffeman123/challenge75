package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {        
        return checkVersions(n,1,n);
    }   
    
    public static int checkVersions(int n, int l, int r){
        if(l <= r && l <= n){
            int middle = l + (r - l)/2;        
            if(isBadVersion(middle) && !isBadVersion(middle-1))
                return middle;
            else if(isBadVersion(middle))            
                return checkVersions(n, l, middle-1);
            else
                return checkVersions(n, middle+1, r);                        
        }                        
        return -1;
    }

    public static Boolean isBadVersion(int version){
        return version == 4 ? true : false;
    }
}
