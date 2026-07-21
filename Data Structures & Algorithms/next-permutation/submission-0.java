class Solution {
    public void nextPermutation(int[] nums) {
        int k=-1;
       for(int i=0;i<nums.length-1;i++)
            if(nums[i]<nums[i+1]){
              k=i;
            }
        if(k!=-1){
        int minidx=-1;
        int min=Integer.MAX_VALUE;
        for(int j=nums.length-1;j>k;j--){
            if(nums[j]>nums[k]&&nums[j]<min){
                min=nums[j];
                minidx=j;
            }
        }
        int t=nums[k];
        nums[k]=nums[minidx];
        nums[minidx]=t;
        }
    int i=k+1;int l=nums.length-1;
    while(i<l){
        int t=nums[i];
        nums[i]=nums[l];
        nums[l]=t;
        i++;
        l--;
    }
    }
}