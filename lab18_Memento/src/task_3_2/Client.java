package task_3_2;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);

        Caretaker caretaker = new Caretaker(triangle);
        TriangleController controller = new TriangleController(triangle, caretaker);
        controller.lazyCommandInit();

        String[] edges = {
                "b",
                "c",
                "a",
                "duplicateA",
                "c",
                "b",
                "halfA"
        };

        float[] values = {
                4,
                5,
                4,
                1, // "duplicateA",
                6,
                3,
                1, // "halfA"
        };

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a" -> controller.setA(values[index]);
                case "b" -> controller.setB(values[index]);
                case "c" -> controller.setC(values[index]);
                case "duplicateA" -> controller.duplicateA();
                case "duplicateB" -> controller.duplicateB();
                case "duplicateC" -> controller.duplicateC();
                case "halfA" -> controller.halfA();
                case "halfB" -> controller.halfB();
                case "halfC" -> controller.halfC();
            }

            System.out.println("Volume = " + triangle.square());
        }

        Memento minAreaMemento = caretaker.getMinAreaMemento();

        if (minAreaMemento != null) {
            minAreaMemento.restore();
            System.out.println("Min area = " + triangle.square());
        }
    }

}
