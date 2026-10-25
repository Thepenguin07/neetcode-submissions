class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> s=new HashSet<>();
      for(int n:nums){
        s.add(n);
      }int max=0;
      for(int n:nums){
        if(!s.contains(n-1)){
            int l=1;
            while(s.contains(n+l))l++;
            max=Math.max(max,l);
        }
      }return max;
    }
}
