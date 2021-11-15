package mediatorpattern;

public class Buyer extends Customer{

    private IRealEstateBroker realEstateBroker;
    private double price;

    Buyer(IRealEstateBroker realEstateBroker, double price){
        super(realEstateBroker);
        this.price = price;
    }

    @Override
    public double getBid() {
        return price;
    }
}
