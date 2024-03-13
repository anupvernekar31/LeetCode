class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            char x = s.charAt(i);
            if(x == '{' || x == '(' || x=='['){
                st.push(x);
                continue;
            }
            if(st.isEmpty()){
                return false;
            }
            else {
                    char c = st.pop();
                switch(c){
                    case '{': if(x == ')' || x == ']')
                        return false;
                        break;
                    case '[': if(x == ')' || x == '}')
                        return false;
                        break;
                    case '(': if(x == '}' || x == ']')
                        return false;
                        break;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}