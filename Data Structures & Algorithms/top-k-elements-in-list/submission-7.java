class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int n:nums)
        m.put(n,m.getOrDefault(n,0)+1);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            pq.offer(new int[]{e.getValue(),e.getKey()});
            if(pq.size()>k)pq.poll();
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll()[1];
        }return res;
    }
}
