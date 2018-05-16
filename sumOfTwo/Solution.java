// Problem link: https://codefights.com/interview-practice/task/Hm98RnqK9Be575yoj
// Status: Accepted

class Solution {
  boolean sumOfTwo(int[] a, int[] b, int v) {
    HashSet<Integer> hs = new HashSet<Integer>();
    for(int num : a) hs.add(num);
    for(int num : b) if(hs.contains(v - num)) return true;
    return false;
  }
}
