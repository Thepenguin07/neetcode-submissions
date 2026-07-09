class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int n:nums)m.put(n,m.getOrDefault(n,0)+1);
        Integer[] arr=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,(a,b)->{
            int freqA=m.get(a),freqB=m.get(b);
            if(freqA!=freqB)return Integer.compare(freqA,freqB);
            return Integer.compare(b,a);
        });
        return Arrays.stream(arr).mapToInt(i->i).toArray();
    }
}