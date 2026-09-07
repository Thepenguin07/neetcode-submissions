class MinStack {

 Stack<Integer> stack;
     Stack<Integer> tmp;
    public MinStack() {
        stack = new Stack<>();
        tmp = new Stack<>();
    }

    public void push(int val) {
         stack.push(val);
        if(tmp.isEmpty()||val<=tmp.peek()){
            tmp.push(val);
        }
    }

    public void pop() {
        if(stack.isEmpty())return;
        int t=stack.pop();
        if(t==tmp.peek())tmp.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return tmp.peek();
    }
}
