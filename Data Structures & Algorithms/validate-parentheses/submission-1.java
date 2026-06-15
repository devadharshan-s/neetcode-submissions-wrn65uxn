class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        
        for(char i : s.toCharArray()){
            if(st.isEmpty() && (i == '}' || i == ')' || i == ']')) return false;
            else if(i == '(' || i == '{' || i == '[') st.push(i);
            else if(i == '}' && st.peek() == '{'
            || i == ')' && st.peek() == '('
            || i == ']' && st.peek() == '[') st.pop();
            else return false;
        }

        return st.isEmpty();
    }
}
