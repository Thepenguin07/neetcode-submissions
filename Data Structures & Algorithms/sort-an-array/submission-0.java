class Solution {
    public void quicksort(int nums[],int l,int h){
         if(l<h){
            int pi=partition(nums,l,h);
            quicksort(nums,l,pi-1);
            quicksort(nums,pi+1,h);
         }
    }
    public int partition(int arr[],int l,int h){
        int p=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<=p){
              i++;
              int t=arr[i];
              arr[i]=arr[j];
              arr[j]=t;
        }}
        int t= arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=t;
        return i+1;
    }
    public int[] sortArray(int[] nums) {
       quicksort(nums,0,nums.length-1);
       return nums;
    }
}