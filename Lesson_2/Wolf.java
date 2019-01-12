public class Wolf {

    //TODO поля: пол, кличка, вес, возраст, окрас
    String gender = "male";
    String wolfName = "Tuzik";
    float weight = 10.3F;
    int age = 3;
    String color = "black";

    //TODO методы: идти, сидеть, бежать, выть, охотиться
    String go() {
        return "the wolf is coming";
    }

    String sit() {
        return "the wolf is sitting";
    }

    String run() {
        return "the wolf is running";
    }

    boolean howl() {
        System.out.println("the wolf howls");
        return true;
    }

    String hunting() {
        System.out.println("the wolf is hunting");
        return "is hunting";
    }
}