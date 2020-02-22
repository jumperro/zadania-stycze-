import java.util.Scanner;

public class Shooter extends Game implements FPP{

   int Ammo=100;
   public Shooter(String title, String type) {
        super(title, type);
    }

    @Override
    public String setAmmo() {
        Scanner skan = new Scanner(System.in);
        System.out.println("Wybierz typ amunicji: (n)oraml, (c)op-killer, armour (p)iercing");
        String ammo=skan.next();
        switch (ammo) {
            case "n":
                return "normal ammo selected";
            case "c":
                return "cop-killer ammo selected";
            case "p":
                return "piercing ammo selected";
        }return ammo;
    }

    @Override
    public int Shot() {
        Ammo--;
        return 0;
    }

    @Override
    public int ActualAmmo() {
        return Ammo;
    }

}
