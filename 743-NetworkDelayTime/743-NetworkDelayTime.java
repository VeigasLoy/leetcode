// Last updated: 7/27/2025, 2:08:55 PM
class Solution {
    public int networkDelayTime(int[][] edges, int n, int k) {
       
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], key -> new ArrayList<>()).add(new int[]{edge[1], edge[2]});
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1]-b[1]);
        pq.offer(new int[]{k, 0});

        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int u = current[0];
            int time = current[1];

            if(time > dist[u]) continue; 

            if(graph.containsKey(u)){
                for (int[] neighbor : graph.get(u)) {
                    int v = neighbor[0];
                    int newTime = time + neighbor[1];
                    if (newTime < dist[v]) {
                        dist[v] = newTime;
                        pq.offer(new int[]{v, newTime});
                    }
                }
            }
        }
        int maxTime = 0;
        for(int i=1;i<=n;i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1; 
            }
            maxTime = Math.max(maxTime, dist[i]);
        }
        return maxTime;
    }
}