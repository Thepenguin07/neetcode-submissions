class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> s1=new Stack<>();
        StringBuilder res=new StringBuilder();
        boolean remove[]=new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                s1.push(i);
            }
            else if(c==')')
            {if(!s1.isEmpty())
                 s1.pop();
             else
             remove[i]=true;
            }}
            while(!s1.isEmpty()){
                remove[s1.pop()]=true;
            }
            for(int i=0;i<s.length();i++){
                if(!remove[i])
                res.append(s.charAt(i));    
        }return res.toString();
    }
}