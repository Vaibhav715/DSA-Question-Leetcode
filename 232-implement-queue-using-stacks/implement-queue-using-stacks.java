// class MyQueue {
//     Stack<Integer> s1;
//     Stack<Integer> s2;
//     public MyQueue() {
//         s1 = new Stack<>();
//         s2 = new Stack<>();
//     }
    
//     public void push(int x) {

//         while(!s1.isEmpty()){
//            int val =  s1.pop();
//             s2.push(val);
//         }
//         s1.push(x);
//          while(!s2.isEmpty()){
//            int val =  s2.pop();
//             s1.push(val);
//         }
//     }
    
//     public int pop() {
//         if(s1.isEmpty()){
//             return -1;
//         }
//         int value = s1.pop();
//         return value;
//     }
    
//     public int peek() {
//          if(s1.isEmpty()){
//             return -1;
//         }
//         return s1.peek();
//     }
    
//     public boolean empty() {
//         return (s1.isEmpty() && s2.isEmpty());
//     }
// }


import java.util.Stack;

class MyQueue {
    private Stack<Integer> s1; // Input stack for push operations
    private Stack<Integer> s2; // Output stack for pop/peek operations

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    // O(1) Time complexity
    public void push(int x) {
        s1.push(x);
    }
    
    // Amortized O(1) Time complexity
    public int pop() {
        if (empty()) {
            return -1;
        }
        shiftStacks();
        return s2.pop();
    }
    
    // Amortized O(1) Time complexity
    public int peek() {
        if (empty()) {
            return -1;
        }
        shiftStacks();
        return s2.peek();
    }
    
    // O(1) Time complexity
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    
    // Helper to transfer elements only when s2 is empty
    private void shiftStacks() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */