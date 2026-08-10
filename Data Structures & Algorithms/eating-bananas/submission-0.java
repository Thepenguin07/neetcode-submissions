class Solution {
    public int time(int arr[],int h){
        int t=0;
        for(int i=0;i<arr.length;i++)
        t+=Math.ceil((double)arr[i]/(double)h);
        return t;
    }

    public int minEatingSpeed(int[] piles, int h) {        int r=Integer.MIN_VALUE;
    for(int n:piles)r=Math.max(r,n);
        int l=1,ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            int timereq=time(piles,m);
            if(timereq<=h){
                ans=m;
                r=m-1;
            }
            else l=m+1;
        }
        return ans;
    }
}
