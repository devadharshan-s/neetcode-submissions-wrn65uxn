class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0, sum = 0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);

        for(int i : nums){
            sum += i;            
            if(m.containsKey(sum - k)) res += m.get(sum - k);
            m.put(sum,m.getOrDefault(sum,0) + 1);
            // System.out.println(sum + " " + m.get(sum));                        
        }

        // if(sum == k) res++;
        return res;
    }
}