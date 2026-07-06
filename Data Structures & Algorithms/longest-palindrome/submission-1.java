class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer> m=new HashMap<>();
       int res=0;
        for(char c:s.toCharArray()){
        m.put(c,m.getOrDefault(c,0)+1);
        if(m.get(c)%2==0)res+=2;
        }
        boolean hasodd=false;
        for(int k:m.values()){
          if(k%2!=0){
            hasodd=true;
            break;
          }
        }
      return hasodd==true?res+1:res;
    }
}