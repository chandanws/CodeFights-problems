// Problem link: https://codefights.com/interview-practice/task/uX5iLwhc6L5ckSyNC
// Status: Accepted

class Solution {
  char firstNotRepeatingCharacter(String s) {
    int [] repeat = new int[26];
    for(char c : s.toCharArray()) repeat[c - 'a']++;
    for(char c : s.toCharArray()) if(repeat[c - 'a'] == 1) return c;
    return '_';
  }
}
