class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack();

        int n = operations.length;

        for(int i = 0; i < n; i++){
            if(operations[i].equals("+")){
                int last = st.pop();
                int secondLast = st.pop();
                st.push(secondLast);
                st.push(last);
                st.push(last + secondLast);
            } else if(operations[i].equals("C")) st.pop();
            else if(operations[i].equals("D")) st.push(2 * st.peek());
            else st.push(Integer.parseInt(operations[i]));
        }

        int res = 0;

        while(!st.isEmpty()) res += st.pop();

        return res;
    }
}