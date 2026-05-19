class Solution {
    public int maxTurbulenceSize(int[] arr) {
        // 2 Truong hop
        //  k là chẵn
        //  arr[k] < arr[k+1]
        // k là lẻ
        // arr[k] > arr[k+1]
        // Hoac
        // k là chẵn
        // arr[k] > arr[k+1]
        // k là lẻ
        // arr[k] <arr[k+1]

        int l = 0,r=1;
        int maxLength = 1;
        String prev = "";
        while(r < arr.length){
            

            if (arr[r-1] > arr[r] && !prev.equals(">")) {
                maxLength = Math.max(maxLength, r - l + 1);
                prev = ">";
                r++;
            } else if (arr[r-1] < arr[r] && !prev.equals("<")) {
                maxLength = Math.max(maxLength, r - l + 1);
                prev = "<";
                r++;
            } else {
                r = (arr[r] == arr[r-1]) ? r+1: r;
                l = r-1;
                prev = "";
            }
        }

        return maxLength;
    }
}