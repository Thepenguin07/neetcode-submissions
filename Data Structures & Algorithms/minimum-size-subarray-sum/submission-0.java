class Solution {
    public int minSubArrayLen(int target,int nums[]) {
        int i=0,s=0;
        int res=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            s+=nums[j];
            while(s>=target){
                res=Math.min(res,j-i+1);
                s-=nums[i];
                 i++;
            }
        }
        return (res==Integer.MAX_VALUE)?0:res;
    }
}