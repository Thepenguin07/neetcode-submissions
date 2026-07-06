class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int c1[]=new int[26];
        for(char c:magazine.toCharArray())c1[c-'a']++;
        int c2[]=new int[26];
        for(char c:ransomNote.toCharArray()){
           c2[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            if(c2[c-'a']>c1[c-'a'])return false;
        }
        return true;
    }
}