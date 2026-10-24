class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> m=new HashMap<>();
       for(String s:strs){
        char a[]=s.toCharArray();
        Arrays.sort(a);
        String key=new String(a);
        m.computeIfAbsent(key,k->new ArrayList<>()).add(s);
       }
       return new ArrayList<>(m.values());
}
}