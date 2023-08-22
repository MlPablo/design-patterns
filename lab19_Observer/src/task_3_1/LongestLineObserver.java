package task_3_1;

public class LongestLineObserver implements Observer {
    private String longestLine = "";

    @Override
    public void update(String line) {
        if (line.length() > longestLine.length()) {
            longestLine = line;
        }
    }

    public String getLongestLine() {
        return longestLine;
    }
}
