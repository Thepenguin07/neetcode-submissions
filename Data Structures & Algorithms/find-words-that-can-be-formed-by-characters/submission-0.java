class Solution {
    public int countCharacters(String[] words, String chars) {
        int c1[]=new int[26];
        for(char c:chars.toCharArray())
         c1[c-'a']++;
        int count=0;
        for(String s: words){
           int c2[]=new int[26];
            boolean good=true;
           for(char c:s.toCharArray()){
               c2[c-'a']++;
               if(c2[c-'a']>c1[c-'a']){
                good=false;
                break;
               }}
                if(good)count+=s.length();
        }return count;
    }
}