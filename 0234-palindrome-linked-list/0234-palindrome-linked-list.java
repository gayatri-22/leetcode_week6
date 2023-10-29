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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        for(ListNode curr = head; curr!=null; curr= curr.next){
            list.add(curr.val);
        }

        int start=0;
        int end = list.size()-1;
        while(start<=end){
            if(list.get(start) != list.get(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}