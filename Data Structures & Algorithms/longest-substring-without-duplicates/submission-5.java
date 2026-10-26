class Solution {
    public int lengthOfLongestSubstring(String s) {
    int l=0,max=0;
        HashSet<Character> s1=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(s1.contains(c)){
                s1.remove(s.charAt(l));
                l++;
            }
                s1.add(c);
            max=Math.max(max,i-l+1);
        }return max;
    }
}
