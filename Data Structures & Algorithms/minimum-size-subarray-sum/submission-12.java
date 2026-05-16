class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, total = 0, r = 0;
        Integer minLength = null;
        while (l <= r && r < nums.length) {
            if (total >= target) {
                int length = r - l;
                minLength = (minLength == null) ? length : Math.min(minLength, length);
                total -= nums[l];
                l++;
            } else {
                total += nums[r];
                r++;
            }
        }
        while (total >= target) {
            total -= nums[l];
            minLength = minLength == null ? r-l : Math.min(minLength, r - l);
            if (total >= target) {
                l++;
            }
        }
        return minLength == null ? 0: minLength;
    }
}