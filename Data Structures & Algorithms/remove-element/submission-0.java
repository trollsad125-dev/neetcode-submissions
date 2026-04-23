class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0,i=0,j= nums.length-1;

        while(i <= j){
            if(nums[i] == val && nums[j] != val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                k++;
                j--;
                i++;
            }else if(nums[i] != val){
                i++;
            }else if(nums[j] == val && nums[i] == val ){
                j--;
                k++;
            }

        }
        return nums.length-k;
    }
}