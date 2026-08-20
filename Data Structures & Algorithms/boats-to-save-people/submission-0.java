class Solution {
    public int numRescueBoats(int[] people, int limit) {
      Arrays.sort(people);
      int l=0,r=people.length-1,c=0;
      while(l<=r){
        int remain=limit-people[r--];
         c++;
         if(l<=r && remain>=people[l])l++;
      }
        return c;
    }}
