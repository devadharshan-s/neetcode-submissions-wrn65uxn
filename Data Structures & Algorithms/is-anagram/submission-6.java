class Solution {
    public boolean isAnagram(String s, String t) {

        int[] freq = new int[26];

        for(int i : s.toCharArray()) freq[i - 'a']++;

        for(int i : t.toCharArray()) freq[i - 'a']--;

        for(int i = 0; i < 26; i++)
            if(freq[i] != 0) return false;

        return true;
    }
}
