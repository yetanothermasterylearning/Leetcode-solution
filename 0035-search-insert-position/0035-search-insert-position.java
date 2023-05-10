class Solution {
    public int searchInsert(int[] nums, int target) {
        /*
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
        */
        //O(logn)
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = (start+end)/2; // integer out of bound exception
            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return end+1;
    }
}