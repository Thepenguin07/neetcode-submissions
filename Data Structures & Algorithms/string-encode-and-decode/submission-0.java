class Solution {

    public String encode(List<String> strs) {
       StringBuilder res=new StringBuilder("");
       for(String s:strs){
        res.append(s.length()).append("+").append(s);
       }
       return res.toString();
    }

    public List<String> decode(String str) {
          List<String> res=new ArrayList<>();
          int i=0;
          while (i < str.length()) {
            int slash = str.indexOf('+', i);
            int size = Integer.parseInt(str.substring(i, slash));
            i = slash + 1 + size;
            res.add(str.substring(slash + 1, slash + 1 + size));
        }
        return res;

    }
}
