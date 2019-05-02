public class subDomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {

        List<String> ls = new ArrayList<String>();


        HashMap<String,Integer> hm = new HashMap<>();
        String dot = new String();
        String inpDom = new String();
        dot = ".";
        int existCount,count;

        for(int i=0;i<cpdomains.length;i++){

            String[] parts;
            String[] wholeString = cpdomains[i].split("\\s+");
            int strCount = Integer.parseInt(wholeString[0]);
            String wString = wholeString[1];
            String[] domains = wString.split("\\.");
            if(domains.length == 2){
                parts = new String[2];
                parts[0] = domains[1];
                parts[1] = domains[0]+"."+domains[1];
                for(int j=0;j<2;j++){
                    if(!hm.containsKey(parts[j])){
                        hm.put(parts[j],strCount);
                    }
                    else{
                        existCount = hm.get(parts[j]);
                        count = strCount+existCount;
                        hm.put(parts[j],count);
                    }
                }
            }
            else if(domains.length == 3){
                parts = new String[3];
                parts[0] = domains[2];
                parts[1] = domains[1] + "."+domains[2];
                parts[2] = domains[0] +  "." + domains[1] + "."+domains[2];
                for(int j=0;j<3;j++){
                    if(!hm.containsKey(parts[j])){
                        hm.put(parts[j],strCount);
                    }

                    else{
                        existCount = hm.get(parts[j]);
                        count = strCount+existCount;
                        hm.put(parts[j],count);
                    }
                }
            }


        }

        Iterator itr = hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry pair = (Map.Entry)itr.next();
            ls.add(pair.getValue() + " " + pair.getKey());

        }



        return ls;

    }

}
