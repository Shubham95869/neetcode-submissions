class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = n;//Search Insert Position must return n when the target is greater than every element.

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                ans = mid;      // Store possible answer
                end = mid - 1;  // Search further left
            } else {
                start = mid + 1; // Search right
            }
        }

        return ans;
    }
}