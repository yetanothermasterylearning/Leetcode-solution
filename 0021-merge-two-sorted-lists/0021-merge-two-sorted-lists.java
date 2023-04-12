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
        ListNode resultList = null, root = null;
        
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        
        while (list1 != null && list2 != null) {
            ListNode element = null;
            if (list1.val <= list2.val) {
                // add list1 element to result and move the list1 cursor
                element = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                // add list2 element to result and move the list2 cursor
                element = new ListNode(list2.val);
                list2 = list2.next;
            }
            
            if (root == null) {
                root = element;
                resultList = root;
            } else {
                resultList.next = element;
                resultList = resultList.next;
            }
        }
        // any of the list left out, append the leftout list to the result
        if (list1 != null) {
            resultList.next = list1;
        }
        if (list2 != null) {
            resultList.next = list2;
        }
        return root;
    }
}