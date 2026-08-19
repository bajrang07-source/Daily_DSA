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
    public ListNode deleteDuplicates(ListNode head) {

        //Approach 1:-----------------
        // if(head == null) return null;

        // ListNode temp = head;
        // HashSet<Integer> set = new HashSet<>();
        // set.add(temp.val);

        // while(temp.next != null){
        //     if(set.contains(temp.next.val)){
        //         temp.next = temp.next.next;

        //     }else{
        //         set.add(temp.next.val);
        //         temp = temp.next;
        //     }  
        // }

        //Approach 2:--------------------------------
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}