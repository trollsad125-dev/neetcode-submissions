class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] arr = new int[26];
            for(char c: str.toCharArray()){
                arr[c - 'a']++;
            }
            String a = Arrays.toString(arr);
            if(map.get(a) != null){
                List<String> strList = map.get(a);
                strList.add(str);
            }else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(Arrays.toString(arr),strList);
            }
        }

        return new ArrayList<>(map.values());
    }
}
