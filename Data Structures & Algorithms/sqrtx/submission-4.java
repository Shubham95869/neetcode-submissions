class Solution {
    public int mySqrt(int x) {
        int s = 1;
        int e = x;
        int ans = 0;
        
        if (x==0) {
            return 0;
        }

        while(s <= e) {
            int mid = s + (e-s)/2;
            if (mid == x/mid) { // x / mid to prevent overflow
                return mid;
            }
            else if (mid  > x/mid) {
                e = mid - 1;
            }
            else {
                // mid*mid < x
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
}