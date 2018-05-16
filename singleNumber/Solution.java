// Problem link: https://codefights.com/interview-practice/task/APDXraJZYfPSYqQMJ/
// Status: Accepted

class Solution {
  int singleNumber(int[] nums) {
    int res = 0;
    for (int num : nums) {
      res ^= num;
    }
    return res;
  }
}
