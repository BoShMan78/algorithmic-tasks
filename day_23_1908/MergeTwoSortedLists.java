// https://leetcode.com/problems/merge-two-sorted-lists/submissions/1362218752/

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
        if (list1 == null && list2 == null) {
                return null;
            }if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }
            List<Integer> integerList = new ArrayList<>();
            fromLLtoList(integerList, list1);
            fromLLtoList(integerList, list2);
            List<Integer> sortedList = integerList.stream().sorted().toList();
            return feelLL(sortedList);
        }

        List<Integer> fromLLtoList(List<Integer> inputList, ListNode firstNode) {
            ListNode currentNode = firstNode;
            inputList.add(currentNode.val);
            while (currentNode.next != null){
                currentNode = currentNode.next;
                inputList.add(currentNode.val);
            }
            return inputList;
        }

        ListNode feelLL(List<Integer> inputList) {
            ListNode headNode = new ListNode(inputList.get(0));
            ListNode currentNode = new ListNode();
            headNode.next = currentNode;
            for (int i = 1; i < inputList.size() - 1; i++) {
                currentNode.val = inputList.get(i);
                ListNode nextNode = new ListNode();
                currentNode.next = nextNode;
                currentNode = nextNode;
            }
            currentNode.val = inputList.get(inputList.size() - 1);
            return headNode;
        }
    }
        
    
