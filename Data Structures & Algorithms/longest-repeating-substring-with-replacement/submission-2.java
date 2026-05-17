class Solution {
    public int characterReplacement(String s, int k) {
        // Calculate sliding window length - max frequency <= k --> r++
        // if not valid l++
        // return maxLength
        int l =0, maxLength = 0,r = 0;
        int[] freq = new int[26];
        while(r < s.length()){
            char c = s.charAt(r);
            freq[c - 'A']++;
            int maxFreq = Arrays.stream(freq).max().getAsInt();
            if(r-l +1 - maxFreq <= k){
                maxLength = r - l +1;
            }else{
              freq[s.charAt(l) - 'A']--;
                l++;

            }
            r++;

        }
        return maxLength;
    }
}
