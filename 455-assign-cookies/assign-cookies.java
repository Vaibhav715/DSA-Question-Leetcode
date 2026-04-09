class Solution {
public int findContentChildren(int[] g, int[] s) {
    
    Arrays.sort(g); // sort greed
    Arrays.sort(s); // sort cookies
    
    int child = 0;
    int cookie = 0;
    
    while (child < g.length && cookie < s.length) {
        
        if (s[cookie] >= g[child]) {
            child++;   // child satisfied
        }
        
        cookie++; // move to next cookie
    }
    
    return child;
    }
}