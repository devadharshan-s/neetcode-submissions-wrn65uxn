class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length, i;

        Arrays.sort(nums);

        if(nums[0] > 1) return 1;

        for(i = 0; i < n - 1; i++){
            if(nums[i] < 0 && nums[i + 1] > 0 && nums[i + 1] > 1) return 1;
            if(nums[i] <= 0 || nums[i] == nums[i + 1]) continue;
            if(nums[i] != nums[i + 1] - 1)
                return nums[i] + 1;
        }

        return i == n - 1 ? (nums[n - 1] + 1 == 0 ? 1 : nums[n - 1] + 1) : 1;
    }
}