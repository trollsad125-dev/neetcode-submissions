class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        //Find the subArray that Avg of total sub-array >= threshold
        //Return number of subarray
        int cnt = 0, total = 0, l = 0,avg = 0;
        for(int r = 0;r<arr.length;r++){
            int range = r - l +1 ;
            if(range <= k){
                total+=arr[r];
                if(range == k){
                    avg = total/k;
                    if(avg >= threshold) cnt++;
                    total -=arr[l];
                    l++;
                }
            }
        }
        return cnt;

    }
}