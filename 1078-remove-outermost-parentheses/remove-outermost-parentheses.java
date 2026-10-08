class Solution {
    public String removeOuterParentheses(String s) {
        int opencount = 0;
        StringBuilder result = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (i == '(') {

                if (opencount > 0) {

                    result.append(i);
                }
                opencount++;
            }

            else {
                opencount--;
                if (opencount > 0)
                    result.append(i);
            }
        }
        return result.toString();
    }
}