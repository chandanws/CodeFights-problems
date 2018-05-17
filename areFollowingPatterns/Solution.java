// Problem link: https://codefights.com/interview-practice/task/3PcnSKuRkqzp8F6BN
// Status: Accepted

class Solution {
  boolean areFollowingPatterns(String[] strings, String[] patterns) {
    int strLen = strings.length, paternLen = patterns.length;
    if(strLen != paternLen) return false;
    Hashtable<String, String> strHt = new Hashtable<String, String>();
    Hashtable<String, String> paternHt = new Hashtable<String, String>();
    for(int i = 0; i < strLen; i++) {
      if(strHt.containsKey(strings[i]) && !strHt.get(strings[i]).equals(patterns[i]) ||
       paternHt.containsKey(patterns[i]) && !paternHt.get(patterns[i]).equals(strings[i])) return false;
      else {
        strHt.put(strings[i], patterns[i]);
        paternHt.put(patterns[i], strings[i]);
      }
    }
    return true;
  }
}
