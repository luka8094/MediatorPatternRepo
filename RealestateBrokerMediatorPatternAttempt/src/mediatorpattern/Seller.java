package mediatorpattern;

import java.util.Random;

public class Seller extends Customer{

    double price;
    IRealestateBroker realestateBroker;

    Seller(IRealestateBroker realestateBroker, double price){
        super(realestateBroker);
        this.price = price;
    }

    @Override
    double getBid() {
        return price;
    }
}
