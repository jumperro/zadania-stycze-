package zoo;

public class Lion extends Animal {
    @Override
    String Sound() {
        return "Lion roars";
    }

    public Lion(int weight, int age, String name, String type) {
        super(weight, age, name, type);
    }

    public Lion() {
    }
}
