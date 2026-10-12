class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int finishingorder[] = new int[friends.length];
        int k = 0;
        for(int i = 0; i<order.length; i++){
            int check = order[i];
            for(int j = 0; j<friends.length; j++){
                if(check == friends[j]){
                   finishingorder[k] = check;
                    k++;
                }
            }
            if(k>friends.length) break;
        }
        return finishingorder;
    }
}