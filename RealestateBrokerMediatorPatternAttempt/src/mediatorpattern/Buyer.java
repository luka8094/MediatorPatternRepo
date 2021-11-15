package mediatorpattern;

import java.util.Random;

public class Buyer extends Customer{

    IRealestateBroker realestateBroker;
    double price;

    Buyer(IRealestateBroker realestateBroker, double price){
        super(realestateBroker);
        this.price = price;
    }

    @Override
    public double getBid() {
        return price;
    }
}
