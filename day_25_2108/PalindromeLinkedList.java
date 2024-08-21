// https://leetcode.com/problems/palindrome-linked-list/submissions/1363400137/

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> integerList = new ArrayList<>();
        ListNode currentNode = head;
        integerList.add(head.val);
        while(currentNode.next != null){
            currentNode = currentNode.next;
            integerList.add(currentNode.val);
        }

        for (int i = 0; i < integerList.size() / 2; i++) {
            if (integerList.get(i) != integerList.get(integerList.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
