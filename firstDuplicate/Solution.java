// Problem link: https://codefights.com/interview-practice/task/pMvymcahZ8dY4g75q
// Status: Accepted

class Solution {
  int firstDuplicate(int[] a) {
    int len = a.length;
    for(int i = 0; i < len; i++) {
      int index = Math.abs(a[i]);
      if(a[index - 1] < 0) return index;
      a[index - 1] *= -1;
    }
    return -1;
  }
}
