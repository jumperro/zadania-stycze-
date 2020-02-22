package Money;

public class Dollar extends Money implements InterMoney {
    public Dollar(double money) {
        super(money);
    }

    public double add(){
        return  super.money+getAmmount();
    }

    @Override
    public double getAmmount() {
        return super.getAmmount();
    }
}
