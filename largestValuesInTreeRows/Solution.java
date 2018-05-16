// Problem link: https://codefights.com/interview-practice/task/m9vC4ALaAeudkwRTF
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
  void helper(Tree<Integer> t, ArrayList<Integer> result, int level) {
    if(t == null) return;
    if(result.size() <= level) {
      result.add((int) t.value);
    } else if(result.get(level) < (int) t.value) {
      result.set(level, (int) t.value);
    }
    helper(t.left, result, level + 1);
    helper(t.right, result, level + 1);
  }
  int[] largestValuesInTreeRows(Tree<Integer> t) {
    ArrayList<Integer> l = new ArrayList<Integer>();
    helper(t, l, 0);
    int size = l.size();
    int [] result = new int[size];
    for(int i = 0; i < size; i++) result[i] = l.get(i);
    return result;
  }
}
