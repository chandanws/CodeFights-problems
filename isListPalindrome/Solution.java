// Problem link: https://codefights.com/interview-practice/task/HmNvEkfFShPhREMn4
// Status: Accepted

// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//

class Solution {
  ListNode<Integer> reverseLinkedList(ListNode<Integer> head) {
    ListNode<Integer> newHead = null;
    while(head != null) {
      ListNode<Integer> next = head.next;
      head.next = newHead;
      newHead = head;
      head = next;
    }
    return newHead;
  }
  boolean isListPalindrome(ListNode<Integer> l) {
    if(l == null) return true;
    ListNode<Integer> slow = l, fast = l, prevNode = null;
    while(slow != null && fast != null) {
      prevNode = slow;
      slow = slow.next;
      fast = fast.next;
      if(fast != null) fast = fast.next;
    }
    prevNode.next = null;
    ListNode<Integer> newHead = reverseLinkedList(slow);
    fast = l;
    while(fast != null && newHead != null) {
      if((int) fast.value != (int) newHead.value) return false;
      fast = fast.next;
      newHead = newHead.next;
    }
    return true;
  }
}
