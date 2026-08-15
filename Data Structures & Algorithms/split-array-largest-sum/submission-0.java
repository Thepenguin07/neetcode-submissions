class Solution {
    public int splitArray(int[] nums, int k) {
        int l=Integer.MIN_VALUE,h=0;
        for(int n:nums){
            l=Math.max(n,l);
            h+=n;
        }
        while(l<=h){
            int max=l+(h-l)/2;
             if(issplitted(nums,max,k))h=max-1;
             else l=max+1;
        }
        return l;
    }
    boolean issplitted(int nums[],int max,int k){
        int c=1,s=0;
        for(int i=0;i<nums.length;i++){
            if(s+nums[i]<=max){
                s+=nums[i];
            }
            else{
                c++;
                s=nums[i];
            }
            if(c>k)return false;
        }return true;
    }
}