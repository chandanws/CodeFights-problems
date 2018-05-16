// Problem link: https://codefights.com/interview-practice/task/4MoqQLaw22nrzXbgs
// Status: Accepted

class Solution {
  int sumInRange(int[] nums, int[][] queries) {
    int numsLen = nums.length;
    long [] sum = new long[numsLen];
    sum[0] = nums[0];
    for(int i = 1; i < numsLen; i++) sum[i] = nums[i] + sum[i - 1];
    int queriesLen = queries.length;
    long [] queriesSum = new long[queriesLen];
    for(int j = 0; j < queriesLen; j++) {
      if(queries[j][0] == 0) queriesSum[j] = sum[queries[j][1]];
      else queriesSum[j] = sum[queries[j][1]] - sum[queries[j][0] - 1];
    }
    int mod = (int) 1e9 + 7;
    for(int k = 1; k < queriesLen; k++) {
      queriesSum[k] += queriesSum[k - 1];
      queriesSum[k] = (queriesSum[k] + mod) % mod;
    }
    return (int) (queriesSum[queriesLen - 1] + mod) % mod;
  }
}
