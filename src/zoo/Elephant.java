package zoo;

import java.util.Scanner;

public class Elephant extends Animal {
    @Override
    String Sound() {
        return "Elephant tmuwuup";
    }

    @Override
    String setName(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("imie :");

        return super.setName(sc.next());
    }

    public Elephant(int weight, int age, String name, String type) {
        super(weight, age, name, type);
    }
}