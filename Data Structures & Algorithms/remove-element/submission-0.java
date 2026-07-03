class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt=0;
        for(int k:nums){
          if(k!=val)
          nums[cnt++]=k;
        }return cnt;
    }
}