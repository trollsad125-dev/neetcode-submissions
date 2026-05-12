class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int[] newArr = new int[k];

        while(k > 0){
            Map.Entry<Integer,Integer> maxEntry = null;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = entry;
                }
            }
            if(maxEntry != null){
                newArr[k-1] = maxEntry.getKey();
                map.remove(maxEntry.getKey());
            }
            
            k--;
        }
        return newArr;
 
    }
}
