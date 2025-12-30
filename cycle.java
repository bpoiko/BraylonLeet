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

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        } //Solution ultizing fast and slow pointers, trying to learn proper implementation
        return false;
    }
}
public class cycle{
  //placeholder lol
}