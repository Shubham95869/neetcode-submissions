class Solution {
    public int missingNumber(int[] nums) {
        //xor with all elements of array
        int xorSum = 0;
        for(int n : nums) {
            xorSum = xorSum ^n;
        }
        //xor with all elements of array
        int n = nums.length;
        for(int i = 0; i<=n; i++) {
            xorSum = xorSum ^i;

        }
        return xorSum;
    }
}
