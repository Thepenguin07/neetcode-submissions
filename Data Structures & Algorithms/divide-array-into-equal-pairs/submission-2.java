class Solution {
    public boolean divideArray(int[] nums) {
      HashMap<Integer,Integer> m=new HashMap<>();
      for(int n:nums)m.put(n,m.getOrDefault(n,0)+1);
      for(int n:nums){
      if(m.get(n)%2!=0)return false;
      }
      return true;
    }
}