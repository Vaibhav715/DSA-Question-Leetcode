class Solution {
    public String removeOuterParentheses(String s) {
       

        int opencount = 0;
        String result = "";
        for(char i : s.toCharArray()){
            if(i == '(' && opencount == 0)
            opencount++;
            else if(i == '(' && opencount >= 1){
                opencount++;
                result += i;
            }

            if(i == ')'){
                opencount--;
                if(opencount >= 1)
                result += i;
            }
        }
        return result;
    }
}