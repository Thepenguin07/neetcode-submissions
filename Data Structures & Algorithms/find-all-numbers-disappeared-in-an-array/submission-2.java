class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
          int ind=Math.abs(nums[i])-1;
          if(nums[ind]>0)
          nums[ind]=-nums[ind];
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)arr.add(i+1);
        }
        return arr;
    }
}