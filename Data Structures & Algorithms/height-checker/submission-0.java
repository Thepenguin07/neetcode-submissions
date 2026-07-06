class Solution {
    public int heightChecker(int[] heights) {
        int count[]=new int[101];
        for(int nums:heights)count[nums]++;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=100;i++){
            int c=count[i];
            for(int j=0;j<c;j++)arr.add(i);
        }
        int res=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr.get(i))res++;
        }return res;
    }
}