class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int n:nums)m.put(n,m.getOrDefault(n,0)+1);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!m.containsKey(i))arr.add(i);
        }
        return arr;
    }
}