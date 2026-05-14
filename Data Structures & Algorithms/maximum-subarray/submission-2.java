class Solution {
    //Using Sliding Window
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], curSum = nums[0],left = 1 ;
        int maxLeft =0, maxRight = 0;

        for(int right =1;right < nums.length;right++){
            if(curSum < 0){
                curSum =0;
                left = right;
            }
            curSum = Math.max(nums[right],curSum + nums[right]);
            

            if(curSum > maxSum){
                maxSum = curSum;
                maxLeft = left;
                maxRight = right;
            }
        }
        return maxSum;
    }
}
