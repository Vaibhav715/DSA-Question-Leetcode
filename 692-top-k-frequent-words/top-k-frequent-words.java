class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word,0) + 1);
        }
        //Decreasing order by Freqency 
        //PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        //For increasing 
        //PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> (map.get(b) == map.get(a) ? a.compareTo(b) : map.get(b) - map.get(a)));
        for(String key : map.keySet()){
            pq.add(key);
        }

        while(k > 0){
            ans.add(pq.remove());
            k--;
        }
        return ans;
    }
}