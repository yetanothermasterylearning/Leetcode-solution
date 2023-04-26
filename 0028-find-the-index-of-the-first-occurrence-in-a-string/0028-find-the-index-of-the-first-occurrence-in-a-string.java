class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if (n > m) {
            return -1;
        }
        //"butsa" , "sad",
        for (int i=0;i<m;i++) {
            if (needle.charAt(0) == haystack.charAt(i) && compareString(haystack, needle, i)) {
                return i;
            }
        }
        return -1;
    }
    
    //"butsa" , "sad", 3/4/5
    private boolean compareString(String haystack,String needle,int startPosition) {
        for (int i=0;i<needle.length();i++) { // needle[i] == haystack[startPosition]
            if (startPosition >= haystack.length() || needle.charAt(i) != haystack.charAt(startPosition)) {
                return false;
            }
            startPosition++;
        }
        return true;
    }
}