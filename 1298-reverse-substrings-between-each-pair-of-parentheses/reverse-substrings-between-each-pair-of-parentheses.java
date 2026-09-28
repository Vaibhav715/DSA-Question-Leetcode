class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> store = new Stack<>();
        StringBuilder str = new StringBuilder();
        // int i = 0;

        //     while (i < s.length()) {
        //         if (s.charAt(i) == ')') {
        //             // Pop characters until '(' into a temporary stack
        //             Stack<Character> temp = new Stack<>();
        //             while (!store.isEmpty() && store.peek() != '(') {
        //                 temp.push(store.pop());
        //             }

        //             // Remove the '('
        //             if (!store.isEmpty() && store.peek() == '(') {
        //                 store.pop();
        //             }

        //             // Reverse the extracted segment using your recursive reverseStack
        //             reverseStack(temp);

        //             // Put them back into the main stack
        //             while (!temp.isEmpty()) {
        //                 store.push(temp.pop());
        //             }
        //         } else {
        //             // Push both normal characters and '('
        //             store.push(s.charAt(i));
        //         }
        //         i++;
        //     }

        //     // Construct final string in correct order (bottom to top)
        //     for (char c : store) {
        //         str.append(c);
        //     }
        //     return str.toString();
        // }

        // public static void pushAtBottom(Stack<Character> s, char data) {
        //     if (s.isEmpty()) {
        //         s.push(data);
        //         return;
        //     }
        //     char top = s.pop();
        //     pushAtBottom(s, data);
        //     s.push(top);
        // }

        // public static void reverseStack(Stack<Character> s) {
        //     if (s.isEmpty()) {
        //         return;
        //     }
        //     char top = s.pop();
        //     reverseStack(s);
        //     pushAtBottom(s, top);
        // }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                store.push(str.length());
            } else if (s.charAt(i) == ')') {
                int start = store.pop();
                reverse(str, start, str.length() - 1);
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            // 1. Temporarily store the left character
            char temp = sb.charAt(left);

            // 2. Overwrite left character with right character
            sb.setCharAt(left, sb.charAt(right));

            // 3. Overwrite right character with the stored left character
            sb.setCharAt(right, temp);

            // 4. Move pointers toward the middle
            left++;
            right--;
        }
    }
}