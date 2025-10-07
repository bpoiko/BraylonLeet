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
}
public class cycle{
  //placeholder lol
}