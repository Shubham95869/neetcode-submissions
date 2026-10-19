class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        
        //marking
        for(int i = 0; i<n; i++) {
            int value = Math.abs(nums[i]) ;
            int idx = value - 1;

            if(nums[idx] < 0) {
                continue;
            }
            nums[idx] *= -1;
        }
        //travese array n whenever find positive value add its index + 1  to result
        for(int i=0; i<n; i++) {
            if(nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;


    }
}