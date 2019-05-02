public class generateParanthesis {
    public List<String> generateParenthesis(int n) {

        //BackTracking
        List<String> result = new ArrayList<>();
        backTrack(result,"",0,0,n);
        return result;
    }

    public void backTrack(List<String> result,String cur, int open, int close, int max){
        if(cur.length()==2*max){
            result.add(cur);
            return;
        }

        if(open<max){
            backTrack(result, cur+"(",open+1,close,max);
        }
        if(close<open){
            backTrack(result,cur+")",open,close+1,max);
        }
    }
}
