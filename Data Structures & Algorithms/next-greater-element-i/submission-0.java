class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m=new HashMap<>();
          int ap[]=new int[nums1.length];
          Arrays.fill(ap,-1);
        for(int i=0;i<nums1.length;i++)
           m.put(nums1[i],i);
        for(int i=0;i<nums2.length-1;i++)
        {
             if(!m.containsKey(nums2[i])){
                continue;
                }
             for(int j=i+1;j<nums2.length;j++){
                if(nums2[i]<nums2[j]){
                    int idx=m.get(nums2[i]);
                     ap[idx]=nums2[j];
                     break;
                }
        }}
       return ap;
}}