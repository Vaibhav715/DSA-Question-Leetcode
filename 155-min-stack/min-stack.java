
class MinStack {
    // FIXED: Declared list as an instance variable so all methods can see it
    // ADDED: min variable to track the minimum in O(1) time
    private ArrayList<Integer> list;
    private int min = Integer.MAX_VALUE;

    public MinStack() {
        // FIXED: Initialized the instance variable instead of creating a local one
        list = new ArrayList<>();
    }

    public void push(int value) {
        // TRICK: If the new value is less than or equal to the current min,
        // push the old min onto the stack first, then update min.
        if (value <= min) {
            list.add(min);
            min = value;
        }
        list.add(value);
    }

    // FIXED: Removed 'static' so it can access 'list'
    public boolean isEmpty() {
        return list.size() == 0;
    }

    // FIXED: Changed return type to void to match LeetCode's exact signature
    public void pop() {
        if (isEmpty()) {
            return;
        }
        
        int top = list.remove(list.size() - 1);
        
        // TRICK: If the popped value is the current minimum, 
        // the value below it is the old minimum. Pop again to restore it.
        if (top == min) {
            min = list.remove(list.size() - 1);
        }
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }

    public int getMin() {
        // OPTIMIZED: Replaced Collections.min(list) [O(n)] with the tracker [O(1)]
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */