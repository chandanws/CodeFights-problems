// Problem link: https://codefights.com/interview-practice/task/xrFgR63cw7Nch4vXo
// Status: Accepted

class Solution {
  String[][] groupingDishes(String[][] dishes) {
    Map<String, ArrayList<String>> tm = new TreeMap<String, ArrayList<String>>();
    for(int i = 0; i < dishes.length; i++) {
      for(int j = 1; j < dishes[i].length; j++) {
        if(!tm.containsKey(dishes[i][j])) {
          tm.put(dishes[i][j], new ArrayList<String>());
        }
        tm.get(dishes[i][j]).add(dishes[i][0]);
        tm.put(dishes[i][j], tm.get(dishes[i][j]));
      }
    }
    ArrayList<ArrayList<String>> l = new ArrayList<>();
    for(Map.Entry<String, ArrayList<String>> entry : tm.entrySet()) {
      Collections.sort(tm.get(entry.getKey()));
      if(tm.get(entry.getKey()).size() >= 2) {
        l.add(tm.get(entry.getKey()));
        l.get(l.size() - 1).add(0, entry.getKey());
      }
    }
    int size = l.size();
    String [][] result = new String[size][];
    for(int a = 0; a < size; a++) {
      result[a] = l.get(a).toArray(new String[l.get(a).size()]);
    }
    return result;
  }
}
