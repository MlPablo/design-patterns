package task_3_1;

import java.util.regex.Pattern;

public class LineWithLongestWordObserver implements Observer {
    private String lineWithLongestWord = "";
    private String longestWord = "";
    private final Pattern pattern = Pattern.compile("\\s+");

    @Override
    public void update(String line) {
        String[] words = pattern.split(line);
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
                lineWithLongestWord = line;
            }
        }
    }

    public String getLineWithLongestWord() {
        return lineWithLongestWord;
    }
}
