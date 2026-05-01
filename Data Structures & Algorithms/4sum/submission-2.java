class Solution {

public void check(int i, int j, int[] nums, long target, List<List<Integer>> res){

        int a = j + 1, b = nums.length - 1;

        while(a < b){
            long sum = (long)nums[i] + nums[j] + nums[a] + nums[b];

            if(sum == target){
                res.add(new ArrayList<>(
                    List.of(nums[i], nums[j], nums[a], nums[b]
                    )
                ));

                while(a < b && nums[a] == nums[a + 1]) a++;
                while(a < b && nums[b] == nums[b - 1]) b--;

                a++;b--;
            } else if(sum > target) b--;
            else a++;
        }

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < n; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                check(i,j,nums,target,res);
            }
        }

        return res;
    }
}