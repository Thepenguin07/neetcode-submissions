class Solution {
    public int specialArray(int[] nums) {
        int count[]=new int[nums.length+1];
       for(int num:nums){
          int ind=Math.min(num,nums.length);
          count[ind]++;
       }
       int totalright=0;
       for(int i=nums.length;i>=0;i--){
        totalright+=count[i];
        if(i==totalright)return totalright;
       }return -1;
    }
}