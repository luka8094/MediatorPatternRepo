package mediatorpattern;

public class Seller extends Customer{
    double price;
    IRealEstateBroker realEstateBroker;

    public Seller (IRealEstateBroker realEstateBroker, double price){
        super(realEstateBroker);
        this.price = price;
    }

    @Override
    public double getBid() {
        return price;
    }
}
