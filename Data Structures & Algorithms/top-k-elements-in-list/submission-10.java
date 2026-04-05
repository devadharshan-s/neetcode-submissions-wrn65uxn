class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // TC : O(n)[map building] + O(n) [pushing into heap]
        // SC : O(n)[map] + O(k) heap 
        int[] res = new int[k];
        int n = nums.length;

        Map<Integer,Integer> m = new HashMap<>();

        for(int i = 0; i < n; i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }

        // [1,1]
        // [2,2]
        // [3,3]

        // [1,1]
        // [2,2]
        // [3,3]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for(int key : m.keySet()){
            pq.add(new int[]{m.get(key),key});
            if(pq.size() > k) pq.poll();
        }

        // while(pq.size() > k) pq.poll();
        int idx = 0;

        while(k-- > 0){
            res[idx++] = pq.poll()[1];
        }

        return res;
    }
}
