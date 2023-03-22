class Solution {
    public int[] twoSum(int[] nums, int target) {
        // optimum solution
        if (nums == null || nums.length == 0) {
            return null;
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                return new int[] {index,i};
            } else {
                map.put(target-nums[i], i);
            }
        }
        return null;
    }
}