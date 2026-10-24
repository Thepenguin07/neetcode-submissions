class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
    int c1[]=new int[26];
    // int c2[]=new int[26];
    for(int i=0;i<s.length();i++){c1[s.charAt(i)-'a']++;
    c1[t.charAt(i)-'a']--;}
    for(int n:c1){
        if(n!=0)return false;
    }return true;
    }
}
