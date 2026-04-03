class Solution {
    void merge(int i, int mid, int j, int[] nums){
        
        int left = i, right = mid + 1, n = nums.length;
        int[] temp = new int[j - i + 1];
        int idx = 0;

        while(left <= mid && right <= j){
            if(nums[left] <= nums[right]){ 
                temp[idx] = nums[left];
                left++;
            } else {
                temp[idx] = nums[right];
                right++;
            }
            idx++;
        }

        while(left <= mid) temp[idx++] = nums[left++];
        while(right <= j) temp[idx++] = nums[right++];

        for(int k = 0; k < temp.length; k++)
            nums[i + k] = temp[k];
        
    }
    void solve(int i, int j, int[] nums){
        
        if(i >= j) return;

        int mid = (i + j) / 2;

        solve(i, mid, nums);
        solve(mid + 1, j, nums);
        merge(i,mid,j,nums);
    } 

    public int[] sortArray(int[] nums) {
        solve(0, nums.length - 1, nums);
        return nums;
    }
}