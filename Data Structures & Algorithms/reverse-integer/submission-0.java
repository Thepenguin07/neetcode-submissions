class Solution {
    public int reverse(int x) {
          int t=x;
        x=Math.abs(x);
        String s=String.valueOf(x);
        long res=0;
        for(int i=s.length()-1;i>=0;i--){
            res=res*10+s.charAt(i)-'0';
        }
         if(!(res>=Math.pow(-2,31)&&res<=Math.pow(2,31))) return 0;
        return (t<0)?(int)(res*-1):(int)res;
    }
}
