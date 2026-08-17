class Solution {
    public int getLucky(String s, int k) {
        String s1 = "";
        int i = 0;
        while(i<s.length()){
           int val =  ('z'-'0') - (s.charAt(i)-'0');
           s1 = s1 + (26-val);
           i++;
        }
        int sum = getSum(s1,k);
        return sum;
    }

    int getSum(String s1, int k){
        int val = 0;
        while(k > 0){
        int i = 0;
      while(i<s1.length()){
        val = val + s1.charAt(i)-'0';
        i++;
      }
        s1 = "";
        s1 = s1 + val;
        val = 0;
        k--;
        }

      
        return Integer.parseInt(s1);
    }
}