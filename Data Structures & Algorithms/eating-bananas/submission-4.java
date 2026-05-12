class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Arrays.stream(piles).max().getAsInt(), res = 1;

        while(left <= right){
            int k = left+ (right - left)/2;
            int totalTime = 0;
            for(int pile : piles){
                    totalTime += Math.ceil((double)pile/k);
            }
            if(totalTime <= h){
                res = k;
                right = k-1;
            }else{
                left = k+1;
            }
        }
        return res;
    }
}
