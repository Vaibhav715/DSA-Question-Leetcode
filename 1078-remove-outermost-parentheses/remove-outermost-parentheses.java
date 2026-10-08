class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String result = "";
        
        for (char i : s.toCharArray()) {

            if (i == '(' && st.isEmpty())
                st.push(i);
            else if(i == '('){
                st.push(i);
                result += i;
            }

            if (i == ')' && !st.isEmpty() && st.peek() == '(') {
                 st.pop();
                if (!st.isEmpty()) {
                    result += i;
                }
            }
        }
        return result;
    }
}