class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {//save
                stack.push(c);
            } else { //make a match
                if (stack.isEmpty()) { //but input has right brackets but no left brackets(stack is empty)
                    return false;
                }
                char topElement = stack.pop();
                if ((c == ')' && topElement != '(') || 
                    (c == ']' && topElement != '[') ||
                    (c == '}' && topElement != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}