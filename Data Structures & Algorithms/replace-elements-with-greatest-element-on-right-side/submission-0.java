class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length-1;
        int max = 0;
        while(n >=0){
            if(arr[n] > max) {
                int temp = arr[n];
                arr[n] = max;
                max = temp;

            }else{
                arr[n] = max;
            }
            if(n == arr.length-1){
                arr[n] = -1;
            }
            n--;
        }
        return arr;
    }
}