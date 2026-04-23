class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Method 1 :- DFS algorithm;

    //     ArrayList<ArrayList<Integer>> g = new ArrayList<>();
    //     for (int i = 0; i < numCourses; i++)
    //         g.add(new ArrayList<>());

    //     for (int[] e : prerequisites)
    //         g.get(e[1]).add(e[0]);

    //     int[] v = new int[numCourses];

    //     for (int i = 0; i < numCourses; i++) {
    //         if (v[i] == 0 && dfs(i, g, v))
    //             return false;
    //     }
    //     return true;
    // }

    // boolean dfs(int u, ArrayList<ArrayList<Integer>> g, int[] v) {
    //     v[u] = 1;
    //     for (int x : g.get(u)) {
    //         if (v[x] == 1)
    //             return true;
    //         if (v[x] == 0 && dfs(x, g, v))
    //             return true;
    //     }
    //     v[u] = 2;
    //     return false;


//            Method 2:- Topological Sort;

         ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for(int i=0;i<numCourses;i++) g.add(new ArrayList<>());
        
        int[] in = new int[numCourses];
        
        for(int[] e: prerequisites){
            g.get(e[1]).add(e[0]);
            in[e[0]]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(in[i]==0) q.add(i);
        }
        
        int cnt = 0;
        
        while(!q.isEmpty()){
            int u = q.poll();
            cnt++;
            
            for(int x: g.get(u)){
                in[x]--;
                if(in[x]==0) q.add(x);
            }
        }
        
        return cnt==numCourses;
    }
}