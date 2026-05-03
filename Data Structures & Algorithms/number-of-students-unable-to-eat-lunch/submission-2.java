class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] freq = new int[2];
        int res = 0;
        for (int i = 0; i < students.length; i++) {
            freq[students[i]]++;
            res++;
        }

        for (int i = 0; i < students.length; i++) {
            if (freq[sandwiches[i]] > 0) {
                freq[sandwiches[i]]--;
                res--;
            } else
                break;
        }

        return res;
    }
}