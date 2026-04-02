class Solution {
    public int majorityElement(int[] nums) {
        int res = 0, freq = 0, n = nums.length;

        for(int i = 0; i < n; i++){
            if(freq == 0){
                freq++;
                res = nums[i];
            } else if(nums[i] == res) freq++;
            else freq--;
        }

        return res;
    }
}