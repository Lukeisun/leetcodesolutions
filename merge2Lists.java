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
        ListNode head = new ListNode();
        ListNode headIter = head;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                headIter.next = list1;
                list1 = list1.next;
            } else {
                headIter.next = list2;
                list2 = list2.next;
            }
           headIter=headIter.next;
        }
        if (list1 == null) {
            headIter.next = list2;
        } else if (list2 == null) {
            headIter.next = list1;
        }
        return head.next;
    }
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //     PriorityQueue<Integer> sort = new PriorityQueue<Integer>();
    //     while (list1 != null) {
    //         sort.add(list1.val);
    //         list1 = list1.next;
    //     } 
    //     while (list2 != null) {
    //         sort.add(list2.val);
    //         list2 = list2.next;
    //     } 
    //     if(sort.isEmpty()) return list1;
    //     ListNode head = new ListNode(sort.poll());
    //     ListNode temp = head;
    //     while(!sort.isEmpty()) {
    //         temp.next = new ListNode(sort.poll());
    //         temp = temp.next;
    //     }
    //     return head;
    // }
}