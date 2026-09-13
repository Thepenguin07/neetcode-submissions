class BrowserHistory {
  LinkedList<String> l;
  int c;
    public BrowserHistory(String homepage) {
        l=new LinkedList<>();
        l.addLast(homepage);
        c=0;
    }
    
    public void visit(String url) {
        while(l.size()-1>c)l.removeLast();
        l.addLast(url);
        c++;
    }
    
    public String back(int steps) {
        c=Math.max(0,c-steps);
        return l.get(c);
    }
    
    public String forward(int steps) {
       c=Math.min(l.size()-1,c+steps);
        return l.get(c);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */