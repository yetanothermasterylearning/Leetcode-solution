class Solution {
    public int searchInsert(int[] nums, int target) {
        // O(n)
        int insertPosition = 0;
        boolean isInsertPositionFound = false;
        while (insertPosition<nums.length && !isInsertPositionFound) {
            if (nums[insertPosition] >= target) {
                isInsertPositionFound = true;
            } else {
                insertPosition++;
            }
        }
        return insertPosition;
    }
}