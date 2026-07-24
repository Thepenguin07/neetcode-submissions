class Solution {
    public int[] searchRange(int[] nums, int target) {
        int c[]=new int[]{-1,-1};
        for(int i=0;i<nums.length;i++){
           if(nums[i]==target){
             if(c[0]==-1)c[0]=c[1]=i;
           else{
           c[1]=i;
        }
    }
    }return c;
}}