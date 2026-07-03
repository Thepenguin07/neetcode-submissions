class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            l.add(l(i));
        }
        return l;
    }
        public List<Integer> l(int r){
            List<Integer> list=new ArrayList<>();
        long ans=1;
        list.add(1);
        for(int i=1;i<r;i++){
            ans=ans*(r-i)/i;
             list.add((int)ans);
        }return list;
        }
    }