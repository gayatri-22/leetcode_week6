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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> s = new Stack<>();
       ArrayList<Integer> list = new ArrayList<>();
        int count =0;
       ListNode temp = head;
       while(temp!=null){
           count++;
           list.add(temp.val);
           temp= temp.next; 
       } 
       int[] ans = new int[count];

        
       for(int i=list.size()-1;i>=0;i--){
           while(!s.isEmpty() && s.peek()<=list.get(i)){
               s.pop();
           }
           if(s.isEmpty()){
                ans[i]=0;
           }
           else {
               ans[i] = s.peek();
           }
           s.push(list.get(i));           
       }
       return ans;
    }
}