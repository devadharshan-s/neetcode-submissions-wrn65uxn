class NumArray {

    int[] arr;
// [-2,0,3,-5,2,-1]
// [-2,-2,1,-4,-2,-3]
// [0:2] => 1 - (-2) =>
    public NumArray(int[] nums) {
        int n = nums.length;    
        arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){ 
            sum += nums[i];
            this.arr[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        int res = 0;

        if(left > 0) res += arr[left - 1];

        return arr[right] - res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */