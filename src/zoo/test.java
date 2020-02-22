package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test extends Animal    {
    public test(int weight, int age, String name) {
        super(weight, age, name);
    }

    @Override
    String Sound() {
        return null;
    }

    public static void main(String[] args) {

        String z;
        List<Animal> zwierz = new ArrayList<>();


        Scanner scan = new Scanner(System.in);
        System.out.println("Ile zwierząt chcesz dodać? ");
        int a=scan.nextInt();
        for(int i =0;i<a;i++){
Animal animal = zooBuilder.Create();
           zwierz.add(animal);
       }
        System.out.println("\n\n");
        for(Animal el:zwierz) {
            System.out.println("-----------------------------------");
            System.out.println(el.toString());
            System.out.println(el.type);
            System.out.println(el.Sound());
        }



    }



    }

