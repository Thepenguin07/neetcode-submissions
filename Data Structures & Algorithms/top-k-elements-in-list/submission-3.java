class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length)return nums;
        HashMap<Integer,Integer> m=new HashMap<>();
        ArrayList<Integer>[] freq=new ArrayList[nums.length+1];
        for(int i=0;i<freq.length;i++)
        freq[i]=new ArrayList<>();
        for(int n:nums)m.put(n,m.getOrDefault(n,0)+1);
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int res[]=new int[k];
        int ind=0;
        for(int i=freq.length-1;i>0;i--){
            for(int n:freq[i]){
                res[ind++]=n;
                if(ind==k)return res;
            }
        }
        return res;
    }
}
