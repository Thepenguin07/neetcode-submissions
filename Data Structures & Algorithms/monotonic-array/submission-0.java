class Solution {
    public boolean isMonotonic(int[] nums) {
        int in=1,d=1;
        for(int i=1;i<nums.length;i++){
            if(!(nums[i]<=nums[i-1]))in=0;
            if(!(nums[i]>=nums[i-1]))d=0;
        }return in==1 || d==1;
    }
}