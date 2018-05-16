// Problem link: https://codefights.com/interview-practice/task/6rE3maCQwrZS3Mm2H
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
  ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
    if(l1 == null) return l2;
    if(l2 == null) return l1;
    if((int) l1.value > (int) l2.value) {
      l2.next = mergeTwoLinkedLists(l1, l2.next);
      return l2;
    } else {
      l1.next = mergeTwoLinkedLists(l1.next, l2);
      return l1;
    }
  }
}
