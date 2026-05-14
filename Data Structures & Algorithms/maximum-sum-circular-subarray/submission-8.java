class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = nums[0], minSubArrSum = nums[0] , curMin = nums[0], maxSubArr = nums[0],maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            
            curMin = Math.min(curMin + nums[i],nums[i]);
            totalSum += nums[i];
            minSubArrSum = Math.min(curMin,minSubArrSum);
            
            maxSubArr = Math.max(nums[i],maxSubArr + nums[i]);
            maxSum = Math.max(maxSubArr, maxSum);

        }
        totalSum  = totalSum - minSubArrSum;
        if (maxSum < 0) return maxSum;
        return maxSum > totalSum  ? maxSum : totalSum ;
    }
}