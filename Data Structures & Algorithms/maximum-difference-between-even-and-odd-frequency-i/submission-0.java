class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int e=Integer.MAX_VALUE,o=Integer.MIN_VALUE;
        for(char c:s.toCharArray()){
           if(m.get(c)%2==0&&m.get(c)<e)e=m.get(c);
           else if(m.get(c)%2!=0&&m.get(c)>o)o=m.get(c);
        }
        return o-e;
    }
}