class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length,sum=0;
       for(int i=0;i<k;i++)sum+=cardPoints[i];
       int max=sum;
       for(int i=0;i<k;i++){
        sum-=cardPoints[k-i-1];
        sum+=cardPoints[n-i-1];
        max=Math.max(max,sum);
       }
       return max;
    }
}