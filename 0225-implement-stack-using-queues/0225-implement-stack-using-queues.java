class MyStack {
    Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();

    public MyStack() {
        
        
        
    }
    
    public void push(int x) {
        q1.add(x);
        
        
        
    }
    
    public int pop() {
        if (q1.isEmpty())
            return 0 ;
        
        while(q1.size()!=1)
           { q2.add(q1.peek());
         q1.remove();}
        
        int ans = q1.poll();
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.remove();
        }
        return ans;
    }
    
    public int top() {
        
        if (q1.isEmpty())
            return 0 ;
        
        while(q1.size()!=1)
           { q2.add(q1.peek());
         q1.remove();}
        
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */