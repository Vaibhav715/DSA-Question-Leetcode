class Solution {
    public String removeOuterParentheses(String s) {
     
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