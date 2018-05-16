// Problem link: https://codefights.com/interview-practice/task/BG94ZFECSNo6Kv7XW
// Status: Accepted

class Solution {
  int kthLargestElement(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for(int num : nums) pq.add(num);
    int len = nums.length;
    for(int i = 0; i < len - k; i++) pq.poll();
    return pq.poll();
  }
}
