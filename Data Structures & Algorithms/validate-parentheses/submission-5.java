class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
           boolean b = true;
            char c = s.charAt(i);
            switch (c){
                case '{':
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case '}':
                    if(stack.isEmpty()) return false;
                    b =  stack.pop()  == '{';
                    if(!b) return false;
                    break;
                case ')':
                    if(stack.isEmpty()) return false;
                    b = stack.pop()  == '(';
                    if(!b) return false;
                    break;
                case ']':
                    if(stack.isEmpty()) return false;
                    b = stack.pop()  == '[';
                    if(!b) return false;
                    break;
                    
            }
        }
        return stack.isEmpty();
    }
}
