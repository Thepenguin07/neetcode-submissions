class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int count[]=new int[1001];
        for(int n:arr1)count[n]++;
         int res[]=new int[arr1.length];
         int k=0;
         for(int n:arr2){
            while(count[n]-->0){
                res[k++]=n;
            }
         }
         for(int i=0;i<count.length;i++)
         while(count[i]-->0)res[k++]=i;
       return res;
    }
}