class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        int occur = -1;
        for(int i = 0; i < l1; i++){
            if(l1-i >= l2){
            if(haystack.substring(i,i+l2).equals(needle)){
            occur = i;
            break;
        }
        }
            }
        if(occur!=-1)
        return occur;
        else 
        return-1;

}
}