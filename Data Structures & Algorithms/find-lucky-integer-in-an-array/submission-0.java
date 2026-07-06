class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int a:arr){
            m.put(a,m.getOrDefault(a,0)+1);
        }
        int max=-1;
        for(int h:arr){
            if(m.get(h)==h)max=Math.max(max,h);
        }
        return max;
    }
}