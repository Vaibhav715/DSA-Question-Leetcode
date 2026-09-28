class Solution {
    public int maxDepth(String s) {
        Stack<Character> store = new Stack<>();
        int Obrac = 0, maxOP = 0, i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '('){
            store.push(s.charAt(i));
            Obrac++;
            }

            if(s.charAt(i) == ')'){
            store.pop();
            maxOP = Math.max(maxOP, Obrac);
            Obrac--;
            }

            i++;
        }
        return maxOP;
    }
}