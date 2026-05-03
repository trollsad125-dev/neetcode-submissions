class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        Queue<Integer> sandwichesQueue = new LinkedList<>();
        for (int stu : students) {
            studentQueue.offer(stu);
        }

        for(int sandwich : sandwiches){
            sandwichesQueue.offer(sandwich);
        }

        int count =0;
        while(!studentQueue.isEmpty()){
            if(count == studentQueue.size() && studentQueue.peek() != sandwichesQueue.peek()) break;
            else if(studentQueue.peek() == sandwichesQueue.peek()){
                studentQueue.poll();
                sandwichesQueue.poll();
                count=0;
            }else {
                studentQueue.offer(studentQueue.poll());
                count++;
            }
        }
        return studentQueue.size();
    }
}