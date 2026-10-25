class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> m=new HashMap<>();
       m.put(0,1);
       int res=0,currsum=0;
       for(int n:nums){
        currsum+=n;
        int diff=currsum-k;
        res+=m.getOrDefault(diff,0);
        m.put(currsum,m.getOrDefault(currsum,0)+1);
       }return res;
    }
}