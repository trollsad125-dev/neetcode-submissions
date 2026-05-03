class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = students.length;
        for(int stu:students){
            map.put(stu,map.getOrDefault(stu,0)+1);
        }

        int i = 0;
        for(int stu:students){
            if(map.getOrDefault(sandwiches[i],0) > 0){
                map.put(sandwiches[i],map.getOrDefault(sandwiches[i],0)-1);
                res--;
            }else break;
            i++;
        }

        return res;
    }
}