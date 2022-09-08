/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null) return list2;
        else if (list2 == null) return list1;
        
        ListNode l1 = list1;
        ListNode l2 = list2;
        
        ListNode myHead = new ListNode();
        
        if(l1.val <= l2.val){
            myHead.val = l1.val;
            l1 = l1.next;
        }
        else{
            myHead.val = l2.val;
            l2 = l2.next;
        }
        
        ListNode current = myHead;
        
        while(l1!= null && l2!=null){
            if(l1.val <= l2.val){
                current.next = new ListNode();
                current.next.val = l1.val;
                l1 = l1.next;
            }
            else{
                current.next = new ListNode();
                current.next.val = l2.val;
                l2 = l2.next;
            }
            current = current.next;
        }


        
        if(l1 == null){
            current.next = l2;
        }
        else{
            current.next = l1;
        }
        return myHead; 
        
        
    }
    
}
