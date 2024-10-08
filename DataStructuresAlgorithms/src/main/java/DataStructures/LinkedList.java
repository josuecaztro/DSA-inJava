package DataStructures;

public class LinkedList {

    //LIST NODE CLASS WITH CONSTRUCTORS
    public class ListNode{
        int val;
        ListNode next;

        public ListNode(){
        } //Nullary constructor

        public ListNode(int val){
            this.val = val;
        }

        public ListNode(int val, ListNode node){
            this.val = val;
            this.next = node;
        }
    }

}
