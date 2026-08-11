class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=Integer.MIN_VALUE,h=0;
        for(int n:weights){
            l=Math.max(n,l);
            h+=n;
        }
        int ans=h;
        while(l<=h){
            int m=l+(h-l)/2;
            int s=0,c=1;
            for(int n:weights){
                if(n+s>m){
                    c++;
                    s=n;
                }
                else s+=n;
            }
            if(c<=days){
                ans=m;
                h=m-1;
            }
            else l=m+1;
        }return ans;
    }
}