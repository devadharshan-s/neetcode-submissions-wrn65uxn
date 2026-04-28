class Solution {
    public boolean check(String s){
        int i = 0, j = s.length() - 1;
        
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;j--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                String leftSkip = s.substring(i + 1,j + 1), rightSkip = s.substring(i,j);
                return check(leftSkip) || check(rightSkip);
            }
            i++;j--;
        }

        return true;
    }
}