import java.util.*;
 class ListNode {
     int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public void reorderList(ListNode head) {
        // first stays the same, last node, second, 
        //every other position is modified 
        ListNode slow = head;
        ListNode fast = head.next;
        //finds the middle, slow points at it
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        //reverse the second half
        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        //cut the line into two halves
        
        while(second != null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
            //merge two halfs together
            ListNode first = head;
            second = prev;
            while(second != null){
                ListNode temp1 = first.next;
                ListNode temp2 = second.next;
                first.next = second; // linkfirst half node to one from the second half
                second.next = temp1; // now link that second half back to the first half node
                first = temp1; //  first forward
                second = temp2; // second forward
            }
            
    }
}
public class halves{

}