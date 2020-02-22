import java.util.Scanner;

public class gameBuilder extends Game {


static Game  Create() {

        Scanner skan = new Scanner(System.in);
        System.out.println("What game would you want to add to your collection: (s)trategy, (r)acing, (f)irst person perspective :");
        String x=skan.next();
        System.out.println("tytuł ");
        String z = skan.next();


        switch (x) {
                case "s":
                        return new Strategy(z, "Strategy");
                case "r":
                        return new Simulator(z, "Simulator");
                case "f":
                        return new Shooter(z, "Shooter");
        }
        return new Strategy();

        }

}

