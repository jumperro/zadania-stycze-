package cwiczenia;

import java.util.Scanner;

public class speakers {
    int volume;

    public speakers(int volume) {
        this.volume = volume;
    }

    public speakers() {

    }

    void setVolume(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Set the volume to :");
        volume=scan.nextInt();

    }

    void showVolume(){
        System.out.println("Volume is set to "+volume);
    }
}
