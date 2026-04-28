class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int m = Math.min(word1.length(), word2.length());

        String res = "";

        for(i = 0; i < m; i++){
            res += word1.charAt(i);
            res += word2.charAt(i);
        }

        if(i < word1.length()){
            for(int j = i; j < word1.length(); j++){
                res += word1.charAt(j);
            }
        }

        if(i < word2.length()){
            for(int j = i; j < word2.length(); j++){
                res += word2.charAt(j);
            }
        }

        return res;
    }
}