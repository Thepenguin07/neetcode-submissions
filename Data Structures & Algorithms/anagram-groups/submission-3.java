class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> m=new HashMap<>();
        for(String w:strs){
            char w1[]=w.toCharArray();
            Arrays.sort(w1);
            String e=Arrays.toString(w1);
            m.putIfAbsent(e,new ArrayList<>());
            m.get(e).add(w);
        }
        List<List<String>> res=new ArrayList<>();
        for(String w:m.keySet()){
            res.add(m.get(w));
    }return res;
    }
}
