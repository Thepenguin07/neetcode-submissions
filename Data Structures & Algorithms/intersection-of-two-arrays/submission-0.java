class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> m1=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
         for(int n:nums1)m1.add(n);
         for(int n:nums2)if(m1.contains(n))res.add(n);
         int arr[]=new int[res.size()];
         int i=0;
         for(int k:res)
         arr[i++]=k;
         return arr;
    }
}