// Problem link: https://codefights.com/interview-practice/task/TG4tEMPnAc3PnzRCs
// Status: Accepted

//
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }

class Solution {
  boolean helper(Tree<Integer> t, int s, int sum, int level) {
    if(t == null) return sum == s && level >= 2 ? true : false;
    return helper(t.left, s, sum + (int) t.value, level + 1) || helper(t.right, s, sum + (int) t.value, level + 1);
  }
  boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    if(t == null) return s == 0 ? true : false;
    if(t.left == null && t.right == null && s == (int) t.value) return true;
    return helper(t, s, 0, 0);
  }
}
