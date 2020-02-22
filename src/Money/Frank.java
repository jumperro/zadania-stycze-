package Money;

public class Frank extends Money{
    public Frank(double money) {
        super(money);
    }

    public double add(){
        return super.money+getAmmount();
    }

    @Override
    public double getAmmount() {
        return super.getAmmount();
    }
}
