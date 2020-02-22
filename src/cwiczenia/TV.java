package cwiczenia;

import java.util.Scanner;

public class TV extends Device{
    int channel;
    public TV(String TV) {
        super(TV);
    }

    public TV(String TV, int channel) {
        super(TV);
        this.channel = channel;
    }

    public TV() {

    }

    void channelchng(){
        Scanner skan = new Scanner(System.in);
        System.out.println("Pick the channel to change current :");
channel= skan.nextInt();


    }

    void showCurrentChannel(){
        System.out.println(TV+" is set on the "+channel+" channel.");
    }

    @Override
    void TurnOn() {
        System.out.println(TV+" is turned on on channel "+channel);
//        super.TurnOn();
    }

    @Override
    void TurnOff() {
//        super.TurnOff();
        System.out.println(TV+" is off.");
    }


}
