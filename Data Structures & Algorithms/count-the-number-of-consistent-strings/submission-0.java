class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c1[]=new int[26];
        for(char c:allowed.toCharArray())c1[c-'a']++;
        int count=0;
        for(String s:words){
            int c2[]=new int[26];
            boolean good=true;
            for(char c:s.toCharArray()){
                c2[c-'a']++;
                if(c1[c-'a']==0){
                    good=false;
                    break;
                }
            }
            if(good)count++;
        }return count;
    }
}