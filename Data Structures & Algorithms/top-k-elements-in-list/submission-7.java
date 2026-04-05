class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // TC : O(n)[map building] + O(n) [pushing into heap]
        // SC : O(n)[map] + O(n) heap 
        int[] res = new int[k];
        int n = nums.length;

        Map<Integer,Integer> m = new HashMap<>();

        for(int i = 0; i < n; i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);

        for(int key : m.keySet()) pq.add(new int[]{m.get(key),key});

        int idx = 0;

        while(k-- > 0){
            res[idx++] = pq.poll()[1];
        }

        return res;
    }
}
