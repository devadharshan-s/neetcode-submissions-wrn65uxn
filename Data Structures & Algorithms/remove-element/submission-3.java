class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;

        if(n == 1) {
            return nums[0] == val ? 0 : 1;
        }
        int res = 0;
        int i = 0, j = n - 1;

        while(i < j){
            // swap with the last non val 
            if(nums[i] == val){
                while(j > i && nums[j] == val){ 
                    j--;     
                    res++;
                }
                // if(i == j) break;           
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j--] = temp;      
                res++;      
            }
            i++;
        }

        System.out.println(i + " " + j + " " + res);
        // for(int k = 0; k < n; k++) System.out.print(nums[k] + " ");

        return n - res;
    }
}