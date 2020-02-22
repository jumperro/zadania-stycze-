package Money;

import java.util.Scanner;

public class Exchange extends Money{


    public Exchange(double money) {
        super(money);
    }

    public Exchange() {

    }

    public void dollarToFrank(){
        double ratio = 1.025;
        System.out.printf("%.3f", ratio*super.money);
    }

    public double frankToDollar(){
        double ratio = 0.98;
        return ratio*super.money;
    }
}
