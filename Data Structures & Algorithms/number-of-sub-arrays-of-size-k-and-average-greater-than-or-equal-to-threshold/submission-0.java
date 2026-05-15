class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        //Find the subArray that Avg of total sub-array >= threshold
        //Return number of subarray
        Deque<Integer> deque = new ArrayDeque<>();
        int total = 0;
        int avg = 0;
        int cnt = 0;
        for(int a : arr){
            deque.offerFirst(a);
            total+=a;
            if(deque.size() == k){
                avg = total/k;
                if(avg >= threshold){
                    cnt++;
                }
                int minus = deque.pollLast();
                total -=minus;

                }

        }

        return cnt;

    }
}