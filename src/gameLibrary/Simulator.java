public class Simulator extends Game implements Racing {
    public Simulator(String title, String type) {
        super(title, type);
    }

    @Override
    public void Drive() {
        System.out.println("I drive at speed of "+maxSpeed);
    }
}
