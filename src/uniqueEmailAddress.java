public class uniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs = new HashSet<String>();
        int count = 0;
        for(int i=0;i<emails.length;i++){
            String[] splitDM = emails[i].split("@");
            splitDM[0] = splitDM[0].split("\\+")[0].replace(".","");
            if(!hs.contains(splitDM[0]+splitDM[1])){
                hs.add(splitDM[0]+splitDM[1]);
                count++;
            }
        }
        return count;

    }
}
