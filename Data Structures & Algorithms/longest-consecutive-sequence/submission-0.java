class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int res=0;
        for(int n:nums){
            if(!m.containsKey(n)){
                m.put(n,m.getOrDefault(n-1,0)+ m.getOrDefault(n+1,0)+1);
                m.put(n-m.getOrDefault(n-1,0), m.get(n));
                m.put(n+m.getOrDefault(n+1,0),m.get(n));
                res=Math.max(res,m.get(n));
            }
        }
        return res;
    }
}
