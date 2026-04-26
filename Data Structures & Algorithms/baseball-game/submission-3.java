class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stacks = new Stack<>();
        for(String op : operations){
            switch (op){
                case "D":
                    stacks.push(2 * stacks.peek());
                    break;
                case "C":
                    stacks.pop();
                    break;
                case "+":
                    int top = stacks.pop();
                    int newTop = top +  stacks.peek();
                    stacks.push(top);
                    stacks.push(newTop);
                    break;
                default:
                    stacks.push(Integer.valueOf(op));
                    break;
            }
        }
        int point = 0;
        for(int s :stacks){
            point+=s;
        }
        return point;
    }
}