class Solution {
    public int leastInterval(char[] tasks, int n) {
       int c1[]=new int[26];
       for(char c:tasks)c1[c-'A']++;
       int maxf=Arrays.stream(c1).max().getAsInt();
       int maxCount=0;
       for(int i:c1){
        if(i==maxf){
            maxCount++;
        }
       }
       int time=(maxf-1)*(n+1)+maxCount;
       return Math.max(tasks.length,time);
    }
}
