class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer,Integer> m=new HashMap<>();
      for(int n:nums)m.put(n,m.getOrDefault(n,0)+1);
      for(int n:m.keySet())if(m.get(n)==1)return n;
      return -1;
    }
}