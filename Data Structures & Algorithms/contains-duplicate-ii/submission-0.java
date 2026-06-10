class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0, j = 0, n = nums.length;

        // 1,2,3,4,2 , k = 4
        Set<Integer> st = new HashSet<>();

        while(j < n){
            if(j - i > k){
                st.remove(nums[i]);
                i++;
            }
            if(st.contains(nums[j])) return true;
            st.add(nums[j]);
            j++;
        }

        return false;
    }
}