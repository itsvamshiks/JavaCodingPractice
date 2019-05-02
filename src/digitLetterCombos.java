public class digitLetterCombos {
    public Map<String,String> phone = new HashMap();

    public Solution(){
        phone.put("2","abc");
        phone.put("3", "def");
        phone.put("4", "ghi");
        phone.put("5", "jkl");
        phone.put("6", "mno");
        phone.put("7", "pqrs");
        phone.put("8", "tuv");
        phone.put("9", "wxyz");
    }

    List<String> output = new ArrayList<String>();
    public void backtrack(String combination,String digits){
        if(digits.length()==0)
            output.add(combination);
        else{
            String curDigit = digits.substring(0,1);
            String letters = phone.get(curDigit);
            for(int i=0;i<letters.length();i++){
                String curLetter = letters.substring(i,i+1);
                backtrack(combination+curLetter,digits.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length()!=0)
            backtrack("",digits);

        return output;

    }
}

