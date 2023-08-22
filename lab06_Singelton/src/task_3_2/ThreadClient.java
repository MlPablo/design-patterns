package task_3_2;

public class ThreadClient {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            DirectorLazyThreadSafe director = DirectorLazyThreadSafe.getInstance();

            Car car = director.buildSedan("red");
            System.out.println(car);
        });

        Thread thread2 = new Thread(() -> {
            DirectorLazyThreadSafe director = DirectorLazyThreadSafe.getInstance();

            Car car = director.buildPickUp("blue");
            System.out.println(car);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
