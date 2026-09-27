class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res=0;
    for(int i=0;i<tickets.length;i++){
    if(i<=k)
    {
        if(tickets[i]<=tickets[k])
        res+=tickets[i];
        else
        res+=tickets[k];
    }
    else{
        if(tickets[i]<tickets[k])
    res+=tickets[i];
    else
    res+=tickets[k]-1;
    }
}return res;
    }
}