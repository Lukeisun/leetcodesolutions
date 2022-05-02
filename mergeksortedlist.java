import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(ListNode list : lists){
           while(list != null)
           {
               p.add(list.val);
               list = list.next;
           }
        }
        if(p.isEmpty()) return null;
        ListNode head = new ListNode(p.poll());
        ListNode headIter = head;
        while(!p.isEmpty())
        {
            ListNode n = new ListNode(p.poll());
            headIter.next = n;
            headIter = headIter.next;
        }
        return head;
    }
}
