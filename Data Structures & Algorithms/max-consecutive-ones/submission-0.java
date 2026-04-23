class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxLength =0;
        for(int i: nums){
            if(i == 1) count++;
            else {
                if(maxLength < count){
                    maxLength=count;
                }
                count=0;
            }
        }
        if(maxLength < count) maxLength=count;
        return maxLength;
    }
}