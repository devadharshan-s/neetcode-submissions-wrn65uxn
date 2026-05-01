class Solution {
    // [-4,-1,-1,0,1,2]
    public void check(int i, int[] nums, List<List<Integer>> res){
        int j = i + 1, k = nums.length - 1;

        while(j < k){
            int sum = nums[i] + nums[j] + nums[k];
                
            if(sum == 0){ 
                res.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
                while(j < k && nums[j] == nums[j + 1]) j++;
                while(j < k && nums[k] == nums[k - 1]) k--;
                j++;
                k--;
            } else if(sum > 0) k--;
            else j++;
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            check(i,nums,res);
        }

        return res;
    }
}
