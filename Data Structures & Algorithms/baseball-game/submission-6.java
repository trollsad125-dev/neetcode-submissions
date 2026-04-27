class Solution {
    public int calPoints(String[] operations) {
       int point =0;
       Deque<Integer> deque = new ArrayDeque<>();
       for(String opr:operations){
           if("D".equals(opr)){
               deque.push(2 * deque.peek());
               point += deque.peek();
           } else if ("C".equals(opr)) {
               int a = deque.pop();
               point -=a;
           }else if("+".equals(opr)){
               int top = deque.pop();
               int newTop = deque.peek();
               deque.push(top);
               deque.push(top+newTop);
               point += (top+newTop);
           }else{
               deque.push(Integer.valueOf(opr));
               point += Integer.valueOf(opr);
           }
       }
       return point;
    }
}