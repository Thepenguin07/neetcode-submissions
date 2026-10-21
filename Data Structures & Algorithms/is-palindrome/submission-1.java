class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(char a:s.toCharArray()){
            if((a>='a'&&a<='z')||(a>='A'&&a<='Z')||(a>='0'&&a<='9'))s1+=a;
        }
        int l=0,r=s1.length()-1;
        while(l<r){
            if(s1.charAt(l)!=s1.charAt(r))return false;
            l++; r--;
        }
        return true;
    }
}
