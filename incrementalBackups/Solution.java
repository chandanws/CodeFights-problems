// Problem link: https://app.codesignal.com/company-challenges/datto/NWoHovD8M48E9Diwr
// Status: Accepted

class Solution {
  int[] incrementalBackups(int lastBackupTime, int[][] changes) {
    HashSet<Integer> hs = new HashSet<Integer>();
    for(int i = 0; i < changes.length; i++) {
        if(changes[i][0] <= lastBackupTime) continue;
        hs.add(changes[i][1]);
    }
    Iterator itr = hs.iterator();
    int [] res = new int[hs.size()];
    int j = 0;
    while(itr.hasNext()) res[j++] = (int) itr.next();
    Arrays.sort(res);
    return res;
  }
}
