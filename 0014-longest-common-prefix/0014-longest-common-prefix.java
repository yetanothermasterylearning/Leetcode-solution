class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return null;
        }
        
        String smallestString = strs[0];
        
        for(String str:strs) {
            if (str.length() < smallestString.length()) {
                smallestString = str;
            }
        }
        //System.out.println(smallestString); //flow => 4
        
        for(int i=0;i<strs.length;i++) { //["flower","flow","flight"]
            int j = 0;
            StringBuffer currentCommonPrefex = new StringBuffer();
            
            while (j<smallestString.length() && 
                   strs[i].charAt(j) == smallestString.charAt(j)) {// flight <=> flow
                currentCommonPrefex.append(strs[i].charAt(j)); //fl
                j++; //2
            }
            
            if (currentCommonPrefex.length() < smallestString.length()) { //(fl)2 < (flow)4
                smallestString = currentCommonPrefex.toString();
            }
        }
        return smallestString;
    }
}