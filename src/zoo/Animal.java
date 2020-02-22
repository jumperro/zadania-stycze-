package zoo;

import java.util.Scanner;

abstract public class Animal {
    int weight;
    int age;
    String name;
    String type;

    Scanner scan = new Scanner(System.in);

    public Animal(int weight, int age, String name, String type) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.type = type;
    }

    public Animal() {
    }

    public Animal(int weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

     int setWeight(int weight) {
//        System.out.println("Give weight of an animal :");
       return this.weight = weight;
    }

     int setAge(int age) {
//        System.out.println("Provide an information about an age of animal :");
        return this.age = age;
    }

     String setName(String name) {
//        System.out.println("Type the name :");
        return this.name = name;
    }

     void setType(String type) {
//        System.out.println("What type of animal is it : (e)lephant,\n " +
//                "(p)arrot, (g)irrafe, (l)ion ");
        switch (type) {
            case "e":
                this.type = "Elephant";

            case "E":
                this.type = "Elephant";

            case "l":
                this.type = "Lion";

            case "L":
                this.type = "Lion";

            case "p":
                this.type = "Parrot";

            case "P":
                this.type = "Parrot";

            case "g":
                this.type = "Girrafe";

            case "G":
                this.type = "Girrafe";

            default:
                break;
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    abstract String Sound();
}
