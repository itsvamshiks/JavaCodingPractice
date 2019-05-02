public class repeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        String substr;
        List<String> rep = new ArrayList<String>();
        HashSet<String> h = new HashSet<String>();
        if(s.length()<=10){
            return rep;
        }

       /* if(s.length()==10){
            rep.add(s);
            return rep;
        }*/

        for(int i=0;i<=s.length()-10;i++){
            substr = s.substring(i,i+10);
            if(h.add(substr)==false){
                if(!rep.contains(substr)){
                    rep.add(substr);
                }
            }
        }
        return rep;
    }
}
