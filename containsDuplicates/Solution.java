// Problem link: https://codefights.com/interview-practice/task/CfknJzPmdbstXhsoJ
// Status: Accepted

class Solution {
  boolean containsDuplicates(int[] a) {
    HashSet<Integer> hs = new HashSet<Integer>();
    for(int num : a) {
      if(hs.contains(num)) return true;
      else hs.add(num);
    }
    return false;
  }
}
