class Solution {
    public boolean makeEqual(String[] words) {
      HashMap<Character,Integer> m=new HashMap<>();
      for(int i=0;i<words.length;i++){
       String s=words[i];
       for(char c:s.toCharArray()){
        m.put(c,m.getOrDefault(c,0)+1);
       }
    }
    for(int k:m.values()){
      if(k%words.length!=0)return false;
    }    return true;
    }
}