class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++) {
            //create sum
            sum = sum + nums[i];
            //update maxSum
            maxi = Math.max(maxi, sum);
            //check sum for negative value
            if(sum < 0) {
                sum = 0;
            }
        }
        //return maxValue
        return maxi;
    }
}
