package task_3_1;

import java.util.regex.Pattern;

public class LongestWordObserver implements Observer {
    private String longestWord = "";
    private final Pattern pattern = Pattern.compile("\\s+");

    @Override
    public void update(String line) {
        String[] words = pattern.split(line);
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }

    public String getLongestWord() {
        return longestWord;
    }
}
