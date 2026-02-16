import java.util.*;
class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> check = new HashSet<>();
        ListNode curr = head;
        if(curr.next == null){
            return false;
        }
        while(curr != null){
            if(check.contains(curr)){ // have we seen this node before? It cycles!
                return true;
            }
            check.add(curr);
            curr = curr.next; // move along
        }
        return false;
    }
       public boolean hasCyclePointer(ListNode head) {
       
        ListNode slow = head;
        ListNode fast = head;
        if(head == null){
            return false; // redid this problem some months later and now there is a new edge case where the head is null
        }
        while(fast.next!= null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        } //another small fix.. fast.next != null && fast.next.next != null should be the condition not fast alone
        return false;
    }
}
public class cycle{
  //placeholder lol
}