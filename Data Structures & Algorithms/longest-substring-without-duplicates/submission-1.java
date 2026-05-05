class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxCount = Integer.MIN_VALUE;
       if(s.isEmpty()) return 0;
        for(int i =0;i<s.length();i++){
            Set<Character> set = new HashSet<>();
            for(int right = i;right < s.length();right++){
                if(set.contains(s.charAt(right))) break;
                else {
                    set.add(s.charAt(right));
                    maxCount = Math.max(maxCount,set.size());
                }
            }
        }

        return maxCount;
    }
}
