class Solution {
    public int maxArea(int[] heights) {
        int l=0,h=heights.length-1,res=Integer.MIN_VALUE;
        while(l<=h){
            int area=Math.min(heights[l],heights[h])*(h-l);
            res=Math.max(area,res);
            if(heights[l]<=heights[h])l++;
            else h--;
        }
return res;
    }
}
