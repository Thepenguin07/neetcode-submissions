class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p[]=new int[nums.length];
        int s[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0)p[i]=1;
            else p[i]=p[i-1]*nums[i-1];
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1)s[i]=1;
            else s[i]=s[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++)
        nums[i]=p[i]*s[i];
        return nums;
    }
}  
