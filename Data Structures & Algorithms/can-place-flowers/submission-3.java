class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m[]=new int[flowerbed.length+2];
        int c=0;
        for(int i=0;i<flowerbed.length;i++)
        {
            m[i+1]=flowerbed[i];
        }
        for(int i=1;i<flowerbed.length+1;){
          if(m[i]==0&&m[i-1]==0&&m[i+1]==0){c++;i+=2;}
          else i++; 
        }
        if(n<=c)return true;
        return false;
    }
}