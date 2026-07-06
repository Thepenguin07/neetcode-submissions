class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        int res=0;
        for(int k:m.values())
{
    res+=k*(k-1)/2;
}    return res;
}
}