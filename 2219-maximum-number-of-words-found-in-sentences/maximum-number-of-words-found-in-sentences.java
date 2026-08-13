class Solution {
    public int mostWordsFound(String[] sentences) {
        int Maxcount = 0;
        for(int i = 0; i<sentences.length; i++){
            String s = sentences[i];
            int j = 0, count = 0;
            while(j<s.length()){
                if(s.charAt(j) == ' ') count++;
                j++;
            }
            count++;
            Maxcount = Math.max(Maxcount, count);
        }
        return Maxcount;
    }
}