class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int countLP = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(')
            st.push(s.charAt(i));

            if(s.charAt(i) == ')' && !st.empty() && st.peek() == '('){
            st.pop();
            }
            else if(s.charAt(i) == ')' && st.empty()){
                countLP++;
            }
        }
        return countLP + st.size();
    }
}