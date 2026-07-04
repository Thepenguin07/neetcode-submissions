class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int n:nums)
        m.put(n,m.getOrDefault(n,0)+1);
        for(int n:nums)
        { if(m.get(n)>nums.length/2)return n;
        }
 return -1;
    }
}