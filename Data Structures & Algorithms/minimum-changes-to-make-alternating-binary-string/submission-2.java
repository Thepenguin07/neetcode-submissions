class Solution {
    public int minOperations(String s) {
      int c1=0,curr=0,c2=0;
     for(char c:s.toCharArray()){
      if(c-'0'!=curr)c1++;
      curr^=1;
     }
     curr=1;
      for(char c:s.toCharArray()){
      if(c-'0'!=curr)c2++;
      curr^=1;
     }
     return Math.min(c1,c2);
    }
}