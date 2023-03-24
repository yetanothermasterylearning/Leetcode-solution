class Solution {
    
    public boolean isPalindrome(int x) {
        String input = Integer.toString(x);
        String reverseString =  reverse(input);
        
        return input.equals(reverseString);
    }
    
    private String reverse(String input) {
        char[] inputChar = input.toCharArray();
        int n = inputChar.length;
        
        for(int i=0;i<inputChar.length/2;i++) {
            char temp = inputChar[i];
            inputChar[i] = inputChar[n-1];
            inputChar[n-1] = temp;
            n--;
        }
        
        return new String(inputChar);
    }
}