// Problem link: https://codefights.com/interview-practice/task/yXDg4rAk9ooEjLjdj
// Status: Accepted

class Solution {
  String amendTheSentence(String s) {
    StringBuilder result = new StringBuilder(s);
    int i = -1, sLen = s.length();
    while(++i < sLen) {
      if(result.charAt(i) >= 'A' && result.charAt(i) <= 'Z') {
        result.setCharAt(i, (char) (result.charAt(i) + 32));
        result.insert(i, " ");
        sLen++;
      }
    }
    return result.toString().trim();
  }
}
