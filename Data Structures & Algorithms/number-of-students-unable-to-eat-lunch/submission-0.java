class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int c[]=new int[2];
        int res=students.length;
       for(int i=0;i<students.length;i++){
        c[students[i]]++;
       }
       for(int n:sandwiches){
        if(c[n]>0){res--;c[n]--;}
        else break;
       }
        return res;
    }
}