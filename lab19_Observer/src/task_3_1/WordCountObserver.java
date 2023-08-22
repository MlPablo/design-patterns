package task_3_1;

import java.util.regex.Pattern;

public class WordCountObserver implements Observer {
    private int wordCount = 0;
    private final Pattern pattern = Pattern.compile("\\s+");

    @Override
    public void update(String line) {
        String[] words = pattern.split(line);
        wordCount += words.length;
    }

    public int getWordCount() {
        return wordCount;
    }
}
