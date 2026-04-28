class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> m = new HashMap<>();

        for(String s : strs){
            int[] freq = new int[26];

            for(char i : s.toCharArray()) freq[i - 'a']++;

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < 26; i++){
                sb.append((char) i + 'a');
                sb.append(freq[i]);
            }

            m.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(s);
        }

        return m.values().stream()
                .toList();
    }
}
