// Problem link: https://codefights.com/interview-practice/task/PhNPP45hZGNwpPchi
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
  int[] traverseTree(Tree<Integer> t) {
    if(t == null) return new int[0];
    ArrayList<Integer> l = new ArrayList<Integer>();
    Queue<Tree<Integer>> q = new LinkedList<Tree<Integer>>();
    q.offer(t);
    while(!q.isEmpty()) {
      Tree<Integer> treeNode = q.poll();
      l.add((int) treeNode.value);
      if(treeNode.left != null) q.offer(treeNode.left);
      if(treeNode.right != null) q.offer(treeNode.right);
    }
    int size = l.size();
    int [] result = new int[size];
    for(int i = 0; i < size; i++) result[i] = l.get(i);
    return result;
  }
}
