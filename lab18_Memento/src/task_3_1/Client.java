package task_3_1;

public class Client {

    public static void main(String[] args) {
        TriangleV2 triangle = new TriangleV2(3, 3, 3);
        Caretaker<Memento, TriangleV2> caretaker = new Caretaker<>(triangle);

        String[] edges = {
                "b",
                "c",
                "a",
                "c",
                "b",
        };

        float[] values = {
                4,
                5,
                4,
                2,
                3,
        };

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a" -> triangle.setA(values[index]);
                case "b" -> triangle.setB(values[index]);
                case "c" -> triangle.setC(values[index]);
            }

            caretaker.saveMemento(triangle.save());
            System.out.println("Volume = " + triangle.square());
        }

        Memento maxAreaMemento = caretaker.getMaxAreaMemento();

        if (maxAreaMemento != null) {
            triangle.restore(maxAreaMemento);
            System.out.println("Max area = " + triangle.square());
        }
    }
}
