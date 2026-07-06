class Solution {
    public int maxScore(String s) {
        int t=0;
        for(char c:s.toCharArray())if(c=='1')t++;
        int zl=0;
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0')zl++;
            else t--;
            int currscore=t+zl;
            max=Math.max(max,currscore);
        }
        return max;
    }
}