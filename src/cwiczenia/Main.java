package cwiczenia;

public class Main {
    public static void main(String[] args) {
        Device dev = new Device();
        TV s = new TV();
        homeTheater y = new homeTheater(0);

        dev.TurnOn();
        dev.TurnOff();

        s.TurnOn();
        s.channelchng();
        s.showCurrentChannel();
        s.TurnOff();

        y.TVon();
        y.setVolume();
        y.showVolume();
        y.TVoff();
    }
}
