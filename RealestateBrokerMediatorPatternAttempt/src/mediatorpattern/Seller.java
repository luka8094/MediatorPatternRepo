package mediatorpattern;

public class Seller extends Customer {

    private double price;
    private IRealEstateBroker realEstateBroker;

    public Seller(IRealEstateBroker realEstateBroker, double price) {
        super(realEstateBroker);
        this.price = price;
    }

    @Override
    public double getBid() {
        return price;
    }
}
