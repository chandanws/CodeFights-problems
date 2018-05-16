// Problem link: https://codefights.com/interview-practice/task/gX7NXPBrYThXZuanm
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
  ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    ListNode<Integer> dummyHead = new ListNode<Integer>(0);
    dummyHead.next = l;
    ListNode<Integer> head = dummyHead;
    while(head.next != null) {
      if(head.next.value == k) head.next = head.next.next;
      else head = head.next;
    }
    return dummyHead.next;
  }
}
