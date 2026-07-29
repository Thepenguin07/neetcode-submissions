class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
    int left=0,k=0;
    for(int i=0;i<s.length();i++){
        char a=s.charAt(i);
         while(set.contains(a)){
         set.remove(s.charAt(left));
         left++;
         }
         set.add(a);
         if(k<set.size())
         k=set.size();
        } 
    return k;
    }
}
