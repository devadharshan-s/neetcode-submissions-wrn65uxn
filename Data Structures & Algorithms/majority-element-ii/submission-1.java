class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();

        int el1 = 0, el2 = 0, freq1 = 0, freq2 = 0;

        for(int i : nums){
            if(i == el1) freq1++;
            else if(i == el2) freq2++;
            else if(freq1 == 0){ 
                el1 = i;
                freq1 = 1;
            }
            else if(freq2 == 0){ 
                el2 = i;
                freq2 = 1;
            }
            else {
                freq1--;freq2--;
            }
        }

        freq1 = freq2 = 0;

        for(int i : nums){
            if(i == el1) freq1++;
            else if(i == el2) freq2++;
        }

        if(freq1 > n / 3) res.add(el1);
        if(freq2 > n / 3) res.add(el2);

        return res;
    }
}