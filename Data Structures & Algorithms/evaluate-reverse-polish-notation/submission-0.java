class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String c=tokens[i];
             if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")){
                int b=s.pop();
                int a=s.pop();
                if(c.equals("+"))s.push(a+b);
                else if(c.equals("*"))s.push(a*b);
                else if(c.equals("-"))s.push(a-b);
                else s.push(a/b);
             }
             else{
                 s.push(Integer.parseInt(c));
             }
        }
        return s.pop();
    }
}