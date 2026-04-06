class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder sb = new StringBuilder();

        for(String i : strs){
            int len = i.length();
            sb.append(len);
            sb.append('#');
            sb.append(i);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int i = 0, j = 0, n = str.length();

        while(j < n){            
        
            while(str.charAt(j) != '#') j++;

            int len = Integer.parseInt(str.substring(i,j));

            String cur = str.substring(j + 1, j + len + 1);

            res.add(cur);

            j += len + 1;

            i = j;
        }

        return res;
    }
}
