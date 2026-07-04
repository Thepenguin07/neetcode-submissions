class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> s1=new HashSet<>();
     for(String e: emails){
           String parts[]=e.split("@");
           String local=parts[0];
           String domain=parts[1];
           int plusindex=local.indexOf("+");
           if(plusindex!=-1)
           local=local.substring(0,plusindex);
           local=local.replace(".","");
            s1.add(local+"@"+domain);
           }
           return s1.size();
     }
    }
