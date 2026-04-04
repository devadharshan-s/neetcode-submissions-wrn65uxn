class Solution {
    public void sortColors(int[] nums) {
        
        int ones = 0, twos = 0, zeroes = 0;

        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0) zeroes++;
            else if(nums[i] == 1) ones++;
            else twos++;
        }

        for(int i = 0; i < n; i++){
            if(zeroes-- > 0) nums[i] = 0;
            else if(ones-- > 0) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}