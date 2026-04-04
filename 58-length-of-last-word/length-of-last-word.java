class Solution {
    public int lengthOfLastWord(String s) {
        String result = "";
int i = s.length() - 1;

// remove trailing spaces
while(i >= 0 && s.charAt(i) == ' ') {
    i--;
}

// collect last word
while(i >= 0 && s.charAt(i) != ' ') {
    result += s.charAt(i);
    i--;
}

// reverse the word
String reversed = new StringBuilder(result).reverse().toString();
return reversed.length();
    }
}