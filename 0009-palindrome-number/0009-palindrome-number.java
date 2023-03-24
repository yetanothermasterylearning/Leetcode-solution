class Solution {
    
    public boolean isPalindrome(int x) {
        
        if (x<0) {
            return false;
        }
        
        int n = x;
        int result = 0;
        while(n != 0) {
            int digit = n%10;
            n = n/10;
            result = result*10+digit;
            //System.out.println(digit +","+ result);
        }
        return x == result;
    }
}