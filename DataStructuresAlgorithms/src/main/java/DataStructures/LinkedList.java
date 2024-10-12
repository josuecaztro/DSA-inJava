package DataStructures;

public class LinkedList {

    //LIST NODE CLASS WITH CONSTRUCTORS
    public class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        } //Nullary constructor

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode node) {
            this.val = val;
            this.next = node;
        }
    }

    // Refer to LeetCode 21 - Solution
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //make a new linked list starting with the head
        ListNode myLinks = new ListNode(0);
        //make the tail (the tail will act as the pointer)
        ListNode myTail = myLinks;
        //compare list 1 to list 2 values (when you compare you're pointing at the first node)
        while (list1 != null && list2 != null) {
            //whichever one is less, put that FIRST in your new list
            if (list1.val < list2.val) {
                myTail.next = list1;
                list1 = list1.next;
            } else {
                myTail.next = list2;
                list2 = list2.next;
            }
        /*to implement this, set tail.next to list 2 . then list 2 has to equal list 2.next
        we do this because we will continue comparing the same values until we traverse
        through the linked list appropriately*/
            myTail = myTail.next;
        }
        //clean up any remaining nodes from either linked list
        if (list1 != null) {
            myTail.next = list1;
        } else {
            myTail.next = list2;
        }
        /*return your new linked list just don't include the head do head.next that's
        technically where the first correct node was placed
         */
        return myLinks.next;
    }


    //refer to Leetcode #83 - Solution
    public ListNode deleteDuplicates (ListNode head){
        //current will be our pointer.
        //current is what we use to traverse thru head linked list
        ListNode current = head;

        //the while condition to successfully traverse
        //must include .next because we compare to next value for this occasion
        while (current != null && current.next != null){

        }
    }
}
