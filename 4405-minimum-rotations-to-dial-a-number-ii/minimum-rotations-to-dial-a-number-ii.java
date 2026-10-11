class Solution {
    public int minRotations(int n, String s) {
//  int ans = 0,ans1 = 0; String temp = "";int k = -1;
//         ans = rotate(n,s);
//         for (int i = 0; i < s.length(); i++) {
//             k = i;
//             temp = reverse(s,k,n-1);
//             ans1 = rotate(n,temp);
            
//             if(ans1 < ans){
//                 ans = ans1;
//             }
//         }
//         return ans;
//     }
//     int rotate(int n, String s){
//         int rotation = 0, intial = 0;
//         for (int i = 0; i < s.length(); i++) {
//             int val = s.charAt(i) - '0';
//         if (intial == val) {
//                 rotation += 0;  
// } else if (Math.abs(val - intial) < 10 - Math.abs(val -intial)){
//                 rotation = rotation + Math.abs((val - intial));   
//             } else {
//                 rotation += 10 - Math.abs(val - intial);  
//             }
//             intial = val;
//         }
//         return rotation;
//     }

//     String reverse(String s, int k, int n){
//         StringBuilder str = new StringBuilder();

//     for (int i = 0; i < k; i++) {
//         str.append(s.charAt(i));
//     }
        
//         for(int i = n; i>=k; i--){
//             str.append(s.charAt(i));
//         }
//         return str.toString();
//     }

        if (n == 0) return 0;

        // 1. Compute the original base cost in O(n)
        int baseCost = dist(0, s.charAt(0) - '0');
        for (int i = 0; i < n - 1; i++) {
            baseCost += dist(s.charAt(i) - '0', s.charAt(i + 1) - '0');
        }

        int minCost = baseCost;
        int lastDigit = s.charAt(n - 1) - '0';

        // 2. Evaluate all suffix reversals in O(1) each
        for (int i = 0; i < n; i++) {
            int currentCost;
            if (i == 0) {
                // Replacing '0' -> s[0] with '0' -> s[n - 1]
                currentCost = baseCost - dist(0, s.charAt(0) - '0') + dist(0, lastDigit);
            } else {
                // Replacing s[i - 1] -> s[i] with s[i - 1] -> s[n - 1]
                int prevDigit = s.charAt(i - 1) - '0';
                int currDigit = s.charAt(i) - '0';
                currentCost = baseCost - dist(prevDigit, currDigit) + dist(prevDigit, lastDigit);
            }

            if (currentCost < minCost) {
                minCost = currentCost;
            }
        }

        return minCost;
    }

    // Helper to calculate shortest circular distance on the 0-9 dial
    private int dist(int a, int b) {
        int diff = Math.abs(a - b);
        return Math.min(diff, 10 - diff);
    }
}
