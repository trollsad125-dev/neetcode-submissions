class Solution {
    public int characterReplacement(String s, int k) {
        // Calculate sliding window length - max frequency <= k --> r++
        // if not valid l++
        // return maxLength
        int l =0, maxLength = 0,r = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(r < s.length()){
            char c = s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            Map.Entry<Character,Integer> maxEntry = null;
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(maxEntry == null || entry.getValue() > maxEntry.getValue()){
                    maxEntry = entry;
                }
            }
            if(r-l +1 - maxEntry.getValue() <= k){
                maxLength = r - l +1;
            }else{

                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                l++;
                
            }
            r++;

        }
        return maxLength;
    }
}
