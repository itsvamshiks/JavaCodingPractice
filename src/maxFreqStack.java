public class maxFreqStack {
    Map<Integer,Integer> frequencyMap;
    Map<Integer,Stack<Integer>> group;
    int maxFrequency;

    public FreqStack() {
        frequencyMap = new HashMap();
        group = new HashMap();
        maxFrequency = 0;
    }

    public void push(int x) {
        int frequency = frequencyMap.getOrDefault(x,0)+1;
        frequencyMap.put(x,frequency);
        if(frequency>maxFrequency)
            maxFrequency = frequency;

        //group.computeIfAbsent(frequency,z->System.out.println("Pushing "+frequency+" key with element "+x));
        group.computeIfAbsent(frequency,z->new Stack()).push(x);
    }

    public int pop() {
        int x = group.get(maxFrequency).pop();
        frequencyMap.put(x,frequencyMap.get(x)-1);
        if(group.get(maxFrequency).size()==0)
            maxFrequency--;
        //System.out.println(maxFrequency);

        return x;

    }
}
