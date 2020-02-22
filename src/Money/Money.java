package Money;

import java.util.Scanner;

public class Money implements InterMoney{
    double money = 12;

    public Money(double money) {
        this.money = money;
    }

    public Money() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money1 = (Money) o;
        return money == money1.money;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public double getAmmount() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Podaj ilość piądza");
        return scn.nextDouble();
    }


}
