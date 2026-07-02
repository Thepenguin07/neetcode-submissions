class Solution {
    public int countSeniors(String[] details) {
        int k=0;
        for(int i=0;i<details.length;i++){
            String s=details[i].substring(11,13);
            int age=(s.charAt(0)-'0')*10+s.charAt(1)-'0';
            if(age>60)k++;
        }
        return k;
    }
}