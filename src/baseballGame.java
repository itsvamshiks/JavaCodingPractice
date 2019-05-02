public class baseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        int score=0;
        for(int i=0;i<ops.length;i++){
            switch(ops[i]){
                case "+":
                    int top = stack.pop();
                    int newTop = top+stack.peek();
                    stack.push(top);
                    stack.push(newTop);
                    score+= newTop;
                    break;
                case "C":
                    int top1 = stack.pop();
                    score-= top1;
                    break;
                case "D":
                    int top2 = 2*stack.peek();
                    score+= top2;
                    stack.push(top2);
                    break;
                default:
                    int top3 = Integer.valueOf(ops[i]);
                    stack.push(top3);
                    score+= top3;
                    break;
            }
        }
        return score;


    }
}
