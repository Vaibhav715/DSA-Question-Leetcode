class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                st.push(i);

            if (s.charAt(i) == ')')
                st.pop();
             
            if(!st.empty())
                len = Math.max(len,i - st.peek());
            else 
               st.push(i);
        }

        return len;

    }
}