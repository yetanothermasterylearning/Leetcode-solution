class Solution {
    public boolean isValid(String s) {
        char[] tempArray = new char[s.length()];
        int index = 0;
        
        for (char c:s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {//save
                tempArray[index] = c;
                index++;
            } else {
                if (index == 0) {
                    return false;
                }
                index--;
                char latestBracket = tempArray[index];
                if ((c == ')' && latestBracket != '(') || 
                    (c == ']' && latestBracket != '[') ||
                    (c == '}' && latestBracket != '{')) {
                    return false;
                }
            }
        }
        return index == 0;
        /*
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
        */
    }
}