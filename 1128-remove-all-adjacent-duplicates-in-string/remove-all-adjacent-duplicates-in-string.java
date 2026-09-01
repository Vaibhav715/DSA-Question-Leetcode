class Solution {
    public String removeDuplicates(String s) {
        if (s.length() <= 1) return s;

        Stack<Character> str = new Stack<>();

        // Process characters linearly
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!str.isEmpty() && str.peek() == ch) {
                str.pop();
            } else {
                str.push(ch);
            }
        }

        // Build the result string in O(N) time without recursive reverse
        StringBuilder s1 = new StringBuilder();
        while (!str.isEmpty()) {
            s1.append(str.pop());
        }

        return s1.reverse().toString();
    }
}