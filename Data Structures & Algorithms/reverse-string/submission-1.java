class Solution {
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while(l<r){
            char s1=s[l];
            s[l]=s[r];
            s[r]=s1;
            l++;
            r--;
        }
    }
}