class Solution {
    public int findCenter(int[][] edges) {
        int e1 = edges[0][0], e2 = edges[0][1];
        int center = 0;
        for(int i = 1; i<edges.length;i++){
          if(edges[i][0] == e1) center = e1;
          else if(edges[i][0] == e2) center = e2;
          else if(edges[i][1] == e1) center = e1;
          else if(edges[i][1] == e2) center = e2;
        }
        return center;
    }
}