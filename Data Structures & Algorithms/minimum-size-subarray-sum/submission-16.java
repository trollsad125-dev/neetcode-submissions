class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, res = Integer.MAX_VALUE,total = 0;
        for(int r = 0;r < nums.length;r++){
            
            total+= nums[r];
            while(total >= target){
                res = Math.min(r - l +1, res);
                total -=nums[l];
                l++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}