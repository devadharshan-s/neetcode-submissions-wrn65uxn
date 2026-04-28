class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();

        int n = nums.length;

        for(int i : nums) m.put(i, m.getOrDefault(i,0) + 1);
    
        List<Integer>[] freq = new ArrayList[n + 1];

        for(Integer i : m.keySet()){
            int occ = m.get(i);
            if(freq[occ] == null) freq[occ] = new ArrayList<>();
            freq[occ].add(i);
        }

        int[] res = new int[k];

        int idx = 0;

        for(int i = n; i >= 0; i--){
            if(freq[i] == null) continue;
            for(Integer j : freq[i]){
                if(idx == k) break;
                res[idx++] = j;
            }
            if(idx == k) break;
        }

        return res;
    }
}
