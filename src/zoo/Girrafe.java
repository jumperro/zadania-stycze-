package zoo;

public class Girrafe extends Animal {
    @Override
    String Sound() {


        return  "Girrafe mek-mek";
    }

    public Girrafe(int weight, int age, String name, String type) {
        super(weight, age, name, type);
    }

    public Girrafe() {
    }
}
