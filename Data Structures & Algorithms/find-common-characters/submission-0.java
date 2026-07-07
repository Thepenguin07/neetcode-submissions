class Solution {
    public List<String> commonChars(String[] words) {
       int c1[]=new int[26];
     Arrays.fill(c1,Integer.MAX_VALUE);
       for(int j=0;j<words.length;j++){
        String s=words[j];
        int currcnt[]=new int[26];
        for(char c:s.toCharArray()){
            currcnt[c-'a']++;
        }
        for(int i=0;i<26;i++)c1[i]=Math.min(c1[i],currcnt[i]);
       }
    List<String> a=new ArrayList<>();
    for(int i=0;i<26;i++){
        for(int j=0;j<c1[i];j++)
        a.add(String.valueOf((char)(i+'a')));
    }return a;
    }
}