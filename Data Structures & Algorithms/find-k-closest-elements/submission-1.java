class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // 0,1,2,3
        List<Integer> res = new ArrayList<>();
        
        int n = arr.length;

        int i = 0, j = n - 1;

        while(i < j){
            int mid = (i + j) / 2;

            // if() break;
            if(arr[mid] < x) i = mid + 1;
            else j = mid;
        }

        int left = i - 1, right = i;

        while(k > 0){
            if(left < 0) right++;
            else if(right >= n) left--;
            else if(Math.abs(x - arr[left]) <= Math.abs(x - arr[right])) left--;
            else right++;
            k--;
        }

        for(int a = left + 1; a < right; a++) res.add(arr[a]);
        // if(i == 0){
        //     for(int a = 0; a < k && a < n; a++) res.add(arr[a]);
        //     return res;
        // }

        // if(i == n - 1){
        //     for(int a = i - k; a < i; a++) res.add(arr[a]);
        //     return res;
        // }


        // 2,3,100,101,102 x = 99



        
        return res;
    }
}