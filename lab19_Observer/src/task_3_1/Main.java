package task_3_1;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader("Lab19/src/task_19_3_1/resources/input01.txt");

        WordCountObserver wordCountObserver = new WordCountObserver();
        LongestWordObserver longestWordObserver = new LongestWordObserver();
        LongestLineObserver longestLineObserver = new LongestLineObserver();
        LineWithLongestWordObserver lineWithLongestWordObserver = new LineWithLongestWordObserver();

        fileReader.addObserver(wordCountObserver);
        fileReader.addObserver(longestWordObserver);
        fileReader.addObserver(longestLineObserver);
        fileReader.addObserver(lineWithLongestWordObserver);

        fileReader.read();

        System.out.println("Word count: " + wordCountObserver.getWordCount());
        System.out.println("Longest word: " + longestWordObserver.getLongestWord());
        System.out.println("Longest line: " + longestLineObserver.getLongestLine());
        System.out.println("Line with longest word: " + lineWithLongestWordObserver.getLineWithLongestWord());
    }

}
