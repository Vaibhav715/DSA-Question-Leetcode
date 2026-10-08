class Solution {
    public String removeOuterParentheses(String s) {

         // Stack<Character> st = new Stack<>();
        // String result = "";

        // for (char i : s.toCharArray()) {

        //     if (i == '(' && st.isEmpty())
        //         st.push(i);
        //     else if(i == '('){
        //         st.push(i);
        //         result += i;
        //     }

        //     if (i == ')' && !st.isEmpty() && st.peek() == '(') {
        //          st.pop();
        //         if (!st.isEmpty()) {
        //             result += i;
        //         }
        //     }
        // }
        // return result;

        
        int opencount = 0;
        StringBuilder result = new StringBuilder();
        for(char i : s.toCharArray()){
            if(i == '(' && opencount == 0)
            opencount++;
            else if(i == '(' && opencount >= 1){
                opencount++;
                result.append(i);
            }

            if(i == ')'){
                opencount--;
                if(opencount >= 1)
                result.append(i);
            }
        }
        return result.toString();
    }
}