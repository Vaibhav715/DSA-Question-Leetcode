class Solution {
    public boolean isValid(String s) {
        /*int len=s.length();
        String temp = s;
        String s1="";
        String s2="";

        for(int i=0;i<=len-1;i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                s1=s1+s.charAt(i);    
            }
        }
        int l=temp.length();
        for(int i= l-1 ;i >= 0 ; i--){
            if(temp.charAt(i) == ')'){
                s2=s2+"(";
            }
            else if(temp.charAt(i) == '}'){
                s2=s2+"{";
            }
            else if(temp.charAt(i) == ']'){
                s2=s2+"[";
            }
        }
        // Reverse a string using StringBufferClass
        StringBuilder str = new StringBuilder(s2);
        str = str.reverse();
        String newStr = str.toString();

        if(s1.equals(newStr))
        return true ;
        else if(s1.equals(s2))
        return true ;
        else
        return false;  */


        // Using StringBuilder just like in your original code!
        StringBuilder str = new StringBuilder(); 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // 1. If it's an opening bracket, append it to our string
            if (ch == '(' || ch == '{' || ch == '[') {
                str.append(ch);
            } 
            // 2. If it's a closing bracket, check it against the last opened bracket
            else {
                int lastIndex = str.length() - 1;
                
                // If our string is empty, it means we have a closing bracket but no opening one!
                if (lastIndex < 0) {
                    return false;
                }
                
                char lastOpened = str.charAt(lastIndex);
                
                // 3. If it matches the last opened bracket, delete the last character (pair matched!)
                if ((ch == ')' && lastOpened == '(') ||
                    (ch == '}' && lastOpened == '{') ||
                    (ch == ']' && lastOpened == '[')) {
                    
                    str.deleteCharAt(lastIndex);
                } 
                // 4. If it doesn't match (like the ']' trying to close '(' in "([)]"), it's invalid
                else {
                    return false;
                }
            }
        }
        
        // If the StringBuilder is empty at the end, all pairs were perfectly matched!
        return str.length() == 0;
        }
    }
