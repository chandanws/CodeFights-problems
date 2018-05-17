// Problem link: https://codefights.com/interview-practice/task/tXN6wQsTknDT6bNrf/
// Status: Accepted

class Solution {
  void helper(ArrayList<ArrayList<Tree<Integer>>> l, Tree<Integer> t, int level) {
    if(level >= l.size()) l.add(new ArrayList<>());
    l.get(level).add(t);
    if(t == null) return;
    helper(l, t.left, level + 1);
    helper(l, t.right, level + 1);
  }
  boolean isTreeSymmetric(Tree<Integer> t) {
    ArrayList<ArrayList<Tree<Integer>>> l = new ArrayList<>();
    helper(l, t, 0);
    int len = l.size();
    for(int i = 0; i < len; i++) {
      int size = l.get(i).size(), p1 = 0, p2 = size - 1;
      while(p1 < p2) {
        if(l.get(i).get(p1) != null || l.get(i).get(p2) != null) {
          if((l.get(i).get(p1) == null || l.get(i).get(p2) == null) ||
             ((int) l.get(i).get(p1).value != (int) l.get(i).get(p2).value)) return false;
        }
        if(p1 + 1 == p2) break;
        p1++;
        p2--;
      }
    }
    return true;
  }
}
