import java.util.Scanner;

public abstract class Game implements GameInterface  {
    String title;
    int timesPlayed=0;
    boolean ifwWin;
    int winCounter=0;
    int lostCounter=0;
    String type;
    boolean ifClose;
    boolean playingNow;
    int i;
    int buildCounter;
    int turnCounter=0;

    Scanner skan = new Scanner(System.in);

    public String getTitle() {
        return title;
    }

    public String setTitle() {
        Scanner skan = new Scanner(System.in);
        System.out.println("Tile: ");
        title = skan.next();
        this.title = title;
        return title;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        Scanner skan = new Scanner(System.in);
        System.out.println("Type: ");
        type = skan.next();
        this.type = type;
    }

    public Game(){

    }

     Game(String title, String type){
        this.title=title;
        this.type=type;

    }



    public void turnOn(){
        if(ifClose == true && playingNow==false){
            playingNow=true;
            System.out.println("Initalizing the game...");
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Terminating...");
        ifClose=true;
        playingNow=false;
        timesPlayed++;
        System.out.println("Did you won? : y/n");
        if(skan.next() == "y" || skan.next() == "Y") {
            ifwWin = true;
            winCounter ++;
        }
        if (skan.next() == "n" || skan.next() == "N") {
            ifwWin = false;
            lostCounter ++;
        }
    }
}
