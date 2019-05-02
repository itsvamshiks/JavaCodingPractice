public class reverseOnlyLetters {public String reverseOnlyLetters(String s){
    Stack<Character> letters = new Stack();
    for(char c: s.toCharArray()){
        if(Character.isLetter(c))
            letters.push(c);
    }
    StringBuilder finalS = new StringBuilder();
    for(char c:s.toCharArray()){
        if(Character.isLetter(c))
            finalS.append(letters.pop());
        else
            finalS.append(c);
    }
    return finalS.toString();
}

}
