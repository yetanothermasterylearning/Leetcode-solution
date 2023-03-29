class Solution {
    public int romanToInt(String s) {
        char[] input = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result = 0;
        for (int index = input.length-1;index>=0;index--) {
            int currentResult = map.get(input[index]);
            if (index > 0 && map.get(input[index-1]) < currentResult) {
                System.out.println(map.get(input[index-1]) +","+ currentResult);
                result += currentResult - map.get(input[index-1]);
                index--;
            } else {
                result += currentResult;
            }
        }
        return result;
    }
}