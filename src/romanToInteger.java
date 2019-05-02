public class romanToInteger {
    public int romanToInt(String s) {

        char[] romanString = s.toCharArray();
        HashMap<Character,Integer> romanLiterals = new HashMap<Character,Integer>();
        romanLiterals.put('I',1);
        romanLiterals.put('V',5);
        romanLiterals.put('X',10);
        romanLiterals.put('L',50);
        romanLiterals.put('C',100);
        romanLiterals.put('D',500);
        romanLiterals.put('M',1000);
        int sum=0;

        for(int i=0;i<romanString.length;i++){
            int num = romanLiterals.get(romanString[i]);
            if(i+1<romanString.length){
                int next = romanLiterals.get(romanString[i+1]);
                if(next>num){
                    sum+=next-num;
                    i=i+1;
                }else{
                    sum+=num;
                }
            }
            else{
                sum+=num;
            }
        }
        return sum;
    }
}
