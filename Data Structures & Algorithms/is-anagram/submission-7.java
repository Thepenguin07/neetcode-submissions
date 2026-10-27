class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
     HashMap<Character,Integer> m=new HashMap<>();
     for(char c:s.toCharArray())m.put(c,m.getOrDefault(c,0)+1);
     for(char c:t.toCharArray()){if(!m.containsKey(c))return false;
     m.put(c,m.get(c)-1);}
     for(char v:m.keySet()){
        if(m.get(v)!=0)return false;
     }return true;
    }
}
