// Problem link: https://codefights.com/interview-practice/task/RvDFbsNC3Xn7pnQfH
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
  ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
    if(a == null) return b;
    else if(b == null) return a;
    Stack<Integer> stackA = new Stack<Integer>();
    Stack<Integer> stackB = new Stack<Integer>();
    while(a != null) {
      stackA.push((Integer) a.value);
      a = a.next;
    }
    while(b != null) {
      stackB.push((Integer) b.value);
      b = b.next;
    }
    ListNode<Integer> newHead = null;
    int carry = 0;
    while(!stackA.isEmpty() || !stackB.isEmpty() || carry == 1) {
      Integer x = stackA.isEmpty() ? 0 : stackA.pop();
      Integer y = stackB.isEmpty() ? 0 : stackB.pop();
      carry = carry + x + y;
      ListNode<Integer> newNode = new ListNode<Integer>(carry % 10000);
      newNode.next = newHead;
      newHead = newNode;
      carry /= 10000;
    }
    return newHead;
  }
}
