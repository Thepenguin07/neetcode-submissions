class Solution {
    public int maxAscendingSum(int[] nums) {
        int s=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
             if(nums[i]<=nums[i-1])s=0;
             s+=nums[i];
             res=Math.max(s,res);
        }
        return res;
    }
}