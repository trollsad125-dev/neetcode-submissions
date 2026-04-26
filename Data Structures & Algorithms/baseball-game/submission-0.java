class Solution {
    public int calPoints(String[] operations) {
           Integer prev1Scr = null,prev2Scr= null, point=0;
        Stack<String> stacks = new Stack<>();
        for(int i = operations.length -1;i>=0;i--){
            stacks.push(operations[i]);
        }

        for(int i = stacks.size() -1;i>=0;i--){
            switch(stacks.get(i)){
                case "C":

                    point -=prev1Scr;
                    break;
                case "D":
                    prev2Scr = prev1Scr;
                    prev1Scr = (prev1Scr*2);

                    point =point+prev1Scr;
                    break;
                case "+":
                    prev2Scr = prev1Scr;
                    prev1Scr = prev1Scr+prev2Scr;
                    point = point + prev1Scr;
                    break;
                default:
                    if(prev1Scr == null){
                        prev1Scr = Integer.valueOf(stacks.get(i));
                        point +=prev1Scr;
                    }else if(prev2Scr == null){
                        prev2Scr = Integer.valueOf(stacks.get(i));
                        point +=prev2Scr;
                    }else {
                        prev1Scr = Integer.valueOf(stacks.get(i));
                        point +=prev1Scr;
                    }
                    break;

            }
            stacks.pop();
        }
        return point;
    }
}