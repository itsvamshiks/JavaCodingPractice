import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;

        int L = beginWord.length();

        HashMap<String, ArrayList<String>> comboDict = new HashMap();

        wordList.forEach(word -> {
            for (int i = 0; i < L; i++) {
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1);
                ArrayList<String> transformations = comboDict.getOrDefault(newWord, new ArrayList<String>());
                transformations.add(word);
                comboDict.put(newWord, transformations);
            }
        });

        Queue<Pair<String, Integer>> Q = new LinkedList<Pair<String, Integer>>();
        Q.add(new Pair(beginWord, 1));

        HashMap<String, Boolean> visited = new HashMap();
        visited.put(beginWord, true);
        while (!Q.isEmpty()) {
            Pair<String, Integer> cur = Q.poll();
            String key = cur.getKey();
            int level = cur.getValue();
            for (int i = 0; i < L; i++) {
                String newWord = key.substring(0, i) + '*' + key.substring(i + 1);
                for (String adjWord : comboDict.getOrDefault(newWord, new ArrayList<String>())) {
                    if (adjWord.equals(endWord)) {
                        return level + 1;
                    } else if (!visited.containsKey(adjWord)) {
                        visited.put(adjWord, true);
                        Q.add(new Pair<String, Integer>(adjWord, level + 1));
                    }
                }
            }
        }
        return 0;
    }

    }
