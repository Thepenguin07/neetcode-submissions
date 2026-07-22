class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length+nums2.length];
        int s1=0,s2=0,e1=nums1.length,e2=nums2.length,k=0;
        while(s1<e1&&s2<e2){
            if(nums1[s1]<nums2[s2])res[k++]=nums1[s1++];
            else
            res[k++]=nums2[s2++];
        }
        while(s1<e1){
            res[k++]=nums1[s1++];
        }
        while(s2<e2){
            res[k++]=nums2[s2++];
        }
        if(res.length%2!=0){
             return (double)res[res.length/2];
        }
        return (double) (res[res.length/2]+res[res.length/2-1])/2;
    }
}
