class Solution {
    public String longestCommonPrefix(String[] strs) {
        String bs = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String currentCommon = commonStrings(strs[i], bs, strs[i].length(), bs.length());
            bs = (currentCommon.length() < bs.length()) ? currentCommon : bs;

        }
        return bs;
    }

    String commonStrings(String s1, String s2, int l1, int l2){
        String common = "";
        int i = 0;
        if(l1>=l2){
        while(i<l2){
            if(s1.charAt(i) == s2.charAt(i)){
            common += s1.charAt(i);
            }else break;
            i++;
        }
        
        }
        else{
            while(i<l1){
            if(s1.charAt(i) == s2.charAt(i)){
            common += s1.charAt(i);
            }
            else break;
            i++;
        }
    }
    return common;
}
}