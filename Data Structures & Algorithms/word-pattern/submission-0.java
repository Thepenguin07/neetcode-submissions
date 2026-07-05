class Solution {
    public boolean wordPattern(String pattern, String s) {
       String []words=s.split(" ");
       if(pattern.length()!=words.length)return false;
       HashMap<Character,String> chartoword=new HashMap<>();
       HashMap<String,Character> wordtochar=new HashMap<>();
       for(int i=0;i<pattern.length();i++){
        char c=pattern.charAt(i);
         String w=words[i];
        if(chartoword.containsKey(c)){
            if(!chartoword.get(c).equals(w))return false;
        }else chartoword.put(c,w);
         if(wordtochar.containsKey(w)){
            if(!wordtochar.get(w).equals(c))return false;
        }else wordtochar.put(w,c);
       }
       return true;
    }
}