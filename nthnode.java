import java.util.*;

class SolutionNth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int N = 0;
        ListNode curr = head;
        while(curr != null){
            N++;
            curr = curr.next;
        }

        int removeAt = N - n;
        if(removeAt == 0){
            return head.next;
        }
        curr = head;
        for(int i = 0; i < N-1; i++){
            if((i+1) == removeAt){
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        return head;
    }
}

