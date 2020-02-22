import java.util.Scanner;

public class Strategy extends Game implements TBS, RTS{
    Scanner skan = new Scanner(System.in);

    public Strategy(String title, String type) {
        super(title, type);
    }

    public Strategy() {
        super();
    }

    @Override
    public void turnOn() {
        super.turnOn();

    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public int setSessionTime() {
        System.out.println("Set session counter: ");
        return skan.nextInt();
    }

    @Override
    public void build() {
        System.out.println("A building was built");
        buildCounter++;
    }

    @Override
    public void destroyBuilding() {
        if (buildCounter > 0) {
            buildCounter--;
            System.out.println("Building destroyed");
        }
        else if (buildCounter == 0)
            System.out.println("Nothing to destroy");
    }

    @Override
    public void NextTurn() {
turnCounter++;
    }
}
