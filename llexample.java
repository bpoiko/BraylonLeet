//helpful information when working with linkedlists, arraylists
import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}


public class llexample{
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Jimmy");
        nameList.add("Bobby");
        nameList.add("Ian"); 
        nameList.get(0);
        
        // list is now jimmy, bobby, ian

        // other methods(for now until you need more)
        //.get(int index), this will give you the value at the index you provide

        //.contains(value), boolean that is extremely useful for finding elements
        // .clear, very easy it clears the whole list leaving it empty

        
        ListNode count = new ListNode(1);
        count.next = new ListNode(2);

        ListNode bobby = new ListNode(5, new ListNode(7)); // this is the use of the OTHER constructor when you know what you want your first node to point to

        // just to start I think it's easier to visualize 1 pointing to 2 rather than doing something different
        // think of it as blocks that're split into 2, where count is [count.val | count.next], next stands to be a pointer to the next block
        
        // when working with these NEVER work directly with the list you are given, you do not want to mutilate the starting list
        // typically you will see in academic setting a curr dummy node which is held to copy the list into a different ListNode

        ListNode curr = count; // example here

        while(curr != null){
            // do something
            curr = curr.next; // this is typical to go through and search each value in a linkedlist, think of this as your iterator 
        }



    }
    
  


}