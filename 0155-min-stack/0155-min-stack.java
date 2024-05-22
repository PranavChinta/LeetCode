class MinStack {
    private ArrayList<Integer> stack;
    private ArrayList<Integer> minStack;
    public MinStack() {
        this.stack = new ArrayList<Integer>();
        this.minStack = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        if(this.stack.size()==0){
            this.minStack.add(val);
        }
        else{//stack is non-empty
            int size = this.minStack.size();
            int lastMinStackVal = this.minStack.get(size-1);
            if(val < lastMinStackVal){
                this.minStack.add(val);
            }
            else{
                this.minStack.add(lastMinStackVal);
            }
        }
        this.stack.add(val);
    }
    
    public void pop() {
        int stackSize = this.stack.size();
        this.stack.remove(stackSize-1);
        this.minStack.remove(this.minStack.size()-1);
    }
    
    public int top() {
        int stackSize = this.stack.size();
        return this.stack.get(stackSize-1);
    }
    
    public int getMin() {
        return this.minStack.get(this.minStack.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */