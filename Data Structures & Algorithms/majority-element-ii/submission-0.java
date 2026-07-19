class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int n:nums)m.put(n,m.getOrDefault(n,0)+1);
         for(int v:m.keySet()){
            if(m.get(v)>nums.length/3)arr.add(v);
         }
         return arr;
    }
}