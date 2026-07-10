class Solution {
    public int compress(char[] chars) {
        int i=0,k=0;
        while(i<chars.length){
            chars[k++]=chars[i];
            int j=i+1;
            while(j<chars.length&&chars[i]==chars[j])j++;
            if(j-i>1){
                String s=String.valueOf(j-i);
                for(char c:s.toCharArray())
                chars[k++]=c;
            }
            i=j;
        }return k;
    }
}