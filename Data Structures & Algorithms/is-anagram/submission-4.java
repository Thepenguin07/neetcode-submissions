class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())return false;
      HashMap<Character, Integer> m=new HashMap<>();
      HashMap<Character, Integer> m1=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        m.put(c,m.getOrDefault(c,0)+1);
      }
      for(int i=0;i<t.length();i++){
        char c=t.charAt(i);
        m1.put(c,m1.getOrDefault(c,0)+1);
      }
        for(int i=0;i<s.length();i++){
          if(!m.get(s.charAt(i)).equals(m1.getOrDefault(s.charAt(i), 0)))return false;
        }
    return true;
    }
}
