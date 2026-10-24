class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        // ArrayList<Integer> arr=new ArrayList<>();
        // for(int t1:m.keySet()){
        //     if(m.get(t1)>1)arr.add(t1);
        // }
        // if(arr.size()==0)return nums;
        // int res[]=new int[arr.size()];int l=0;
        // for(int n:arr)res[l++]=n;
        // return res;
        PriorityQueue<Map.Entry<Integer,Integer>> p=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
           p.offer(e);
           if(p.size()>k)p.poll();
        }
      int res[]=new int[k];
      for(int i=0;i<k;i++){
        res[i]=p.poll().getKey();
      }return res;
    }
}
