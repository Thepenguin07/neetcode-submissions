class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int p=0,s=0;
        for(int i=0;i<nums.length;i++){
            p=nums[i]*(p==0?1:p);
            s=nums[nums.length-i-1]*(s==0?1:s);
            res=Math.max(res,Math.max(p,s));
        }return res;
    }
}
