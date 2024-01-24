package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(list1, list2);
        System.out.println(result.toString());
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null && list2 == null)
            return null;
        else if (list1 == null && list2 != null)
            return list2;
        else if (list1 != null && list2 == null)
            return list1;

        ListNode result = new ListNode();
        ListNode traversingNode = new ListNode();
        result.next = traversingNode;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                traversingNode.val = list1.val;
                list1 = list1.next;

                traversingNode.next = new ListNode();
                traversingNode = traversingNode.next;
            }else{
                traversingNode.val = list2.val;
                list2 = list2.next;

                traversingNode.next = new ListNode();
                traversingNode = traversingNode.next;
            }
        }

        if(list1 == null){
            traversingNode.val = list2.val;
            traversingNode.next = list2.next;
        }
        else{
            traversingNode.val = list1.val;
            traversingNode.next = list1.next;
        }

        return result.next;
    }
}
