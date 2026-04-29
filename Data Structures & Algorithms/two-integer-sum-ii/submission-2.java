class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;

        while(i < j){
            int cur = nums[i] + nums[j];

            if(cur > target) j--;
            else if(cur < target) i++;
            else return new int[]{i + 1, j + 1};

        }

        return new int[]{};
    }
}
