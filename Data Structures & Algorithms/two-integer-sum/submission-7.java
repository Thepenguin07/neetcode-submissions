class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> m=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        m.put(nums[i],i);
     }
     for(int i=0;i<nums.length;i++){
        if(m.containsKey(target-nums[i])&&(i!=m.get(target-nums[i])))return new int[]{i,m.get(target-nums[i])};
     }
     return new int[]{};
    }
    
}
