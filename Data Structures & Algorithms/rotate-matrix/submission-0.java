class Solution {
    public void rotate(int[][] matrix) {
        int k=0;
        for(int i=0;i<matrix.length;i++){
           for(int j=i;j<matrix.length;j++){
            int t=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=t;
           }
        }
        for(int arr[]:matrix){
            int i=0,j=matrix.length-1;
            while(i<j){
               int t=arr[i];
               arr[i]=arr[j];
               arr[j]=t;
               i++;
               j--;
            }
        }
    }
}
