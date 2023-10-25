class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char curr : s.toCharArray()){

            if(curr == '(' || curr == '{' || curr=='['){
                st.push(curr);
            }
            else{

                if(st.isEmpty()){
                    return false;
                }

                if(curr == ')' && st.peek() != '('){
                    return false;
                }

                if(curr == '}' && st.peek() != '{'){
                    return false;
                }

                if(curr == ']' && st.peek() != '['){
                    return false;
                }

                st.pop();
            }
        }
        return st.isEmpty(); 
    }
}