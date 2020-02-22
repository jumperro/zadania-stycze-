package zoo;

public class Parrot extends Animal implements Flier {
    @Override
    String Sound() {
        return "It is a talking Parrot";
    }

    public Parrot() {
    }

    public Parrot(int weight, int age, String name, String type) {
        super(weight, age, name, type);
    }
}
