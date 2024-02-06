package com.example;

import java.util.Stack;

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
        
    public static boolean hasCycle(ListNode head) {
        if(head == null) return false;

        Stack<ListNode> nodes = new Stack<>();        
        while(head.next != null){
            if(nodes.contains(head)) return true;
            nodes.add(head);
            head = head.next;
        }
        return false;
    }    

    public static boolean optimizedHasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slowCounter = head;
        ListNode fastCounter = head;
        while(fastCounter != null && fastCounter.next != null){                          
            slowCounter = slowCounter.next;
            fastCounter = fastCounter.next.next;
            if(slowCounter == fastCounter) 
                return true;              
        }
        return false;   
    }    
}
