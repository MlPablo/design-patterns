package task_3_1.src;

public class ImageGallery {

    public static void main(String[] args) {

        DisplayObject[] images = {
            // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
            new ImageProxy("Lab13/src/task_13_2_2/resources/image1.jpeg"),
            new ImageProxy("Lab13/src/task_13_2_2/resources/image2.jpeg"),
            new ImageProxy("Lab13/src/task_13_2_2/resources/image3.jpeg"),
            new ImageProxy("Lab13/src/task_13_2_2/resources/image4.jpeg"),
            new ImageProxy("Lab13/src/task_13_2_2/resources/image5.jpeg"),
            new ImageProxy("Lab13/src/task_13_2_2/resources/image6.jpeg"),
            new ImageProxy("Lab13/src/task_13_2_2/resources/image7.jpeg"),
            new ImageProxy("Lab13/src/task_13_2_2/resources/image8.jpeg"),
            new ImageProxy("Lab13/src/task_13_2_2/resources/image9.jpeg"),
            new ImageProxy("Lab13/src/task_13_2_2/resources/image10.jpeg"),
        };

        for (DisplayObject image : images) {
            image.display();
        }

    }

}
