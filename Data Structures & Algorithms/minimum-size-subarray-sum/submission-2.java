class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // 2,5,6,8,12,15
        int i = 0, j = 0, n = nums.length;

        int res = Integer.MAX_VALUE, sum = 0;

        while(j < n){
            sum += nums[j];
            while(sum >= target){
                res = Math.min(res, j - i + 1);
                sum -= nums[i++];
            }
            j++;
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}