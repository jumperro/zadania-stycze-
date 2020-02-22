package zoo;

import java.util.Scanner;

public class zooBuilder extends Animal {


    public zooBuilder() {
    }



    static Animal Create() {

        Scanner scan = new Scanner(System.in);
        System.out.println("What type of animal is it : (e)lephant,\n " +
                "(p)arrot, (g)irrafe, (l)ion ");
        String z = scan.next();
        System.out.println("name :");
        String c = scan.next();
        System.out.println("Age :");
        int x = scan.nextInt();
        System.out.println("Weight :");
        int y = scan.nextInt();


        if (z.equals("e") || z.equals("E")) {
            z = "Elephant";

        return new Elephant(y, x, c, z);

    }
        if (z.equals("l") || z.equals("L")) {
            z = "Lion";

        return new Lion(y, x, c, z);
    }
        if (z.equals("p") || z.equals("P")) {
            z = "Parrot";

        return new Parrot(y, x, c, z);
    }
            if(z.equals("g") || z.equals("G")){
                z="Parrot";

            return     new Girrafe(y, x, c,z);
            }
        else
        return new Elephant(y,x,c,z);
    }


    @Override
    String Sound() {
        return null;
    }
}

