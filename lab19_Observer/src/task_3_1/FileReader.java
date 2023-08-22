package task_3_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private final String filePath;
    private final List<Observer> observers;

    public FileReader(String filePath) {
        this.filePath = filePath;
        this.observers = new ArrayList<>();

        Thread thread = new Thread(this::read);
        thread.start();
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(this::onLineRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void onLineRead(String line) {
        System.out.println(line);
        notifyObservers(line);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String line) {
        observers.forEach(observer -> observer.update(line));
    }
}
