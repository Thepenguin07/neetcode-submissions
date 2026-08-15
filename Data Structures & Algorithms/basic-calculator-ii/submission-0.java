class Solution {
    public int calculate(String s) {
        Stack<Integer> s1=new Stack<>();
        int num=0;
        char sign='+';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                num=num*10+(s.charAt(i)-'0');
             }
            if(!Character.isDigit(s.charAt(i))&&s.charAt(i)!=' '||i==s.length()-1){
                if(sign=='+')s1.push(num);
                else if(sign=='-')s1.push(-num);
                else if(sign=='*')s1.push(s1.pop()*num);
                else
                s1.push(s1.pop()/num);
                num=0;
                sign=s.charAt(i);
            }
        }
        int res=0;
        while(!s1.isEmpty()){
            res+=s1.pop();
        }
        return res;
    }
}