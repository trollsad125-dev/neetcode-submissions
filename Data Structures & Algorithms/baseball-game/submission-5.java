class Solution {
    public int calPoints(String[] operations) {
       int point =0;
       Stack<Integer> stack = new Stack<>();
       for(String opr:operations){
           if("D".equals(opr)){
               stack.push(2 * stack.peek());
               point += stack.peek();
           } else if ("C".equals(opr)) {
               int a = stack.pop();
               point -=a;
           }else if("+".equals(opr)){
               int top = stack.pop();
               int newTop = stack.peek();
               stack.push(top);
               stack.push(top+newTop);
               point += (top+newTop);
           }else{
               stack.push(Integer.valueOf(opr));
               point += Integer.valueOf(opr);
           }
       }
       return point;
    }
}