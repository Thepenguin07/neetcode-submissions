class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int res[][]=new int[intervals.length][2];
        res[0][0]=intervals[0][0];
        res[0][1]=intervals[0][1];
        int k=1;
        for(int i=1;i<intervals.length;i++){
             int cs=intervals[i][0];
             int le=res[k-1][1];
             if(cs<=le){
                res[k-1][1]=Math.max(le,intervals[i][1]);
             }
             else
             {
                res[k][0]=intervals[i][0];
                res[k][1]=intervals[i][1];
                k++;
             }
        }return Arrays.copyOf(res,k);
    }
}
