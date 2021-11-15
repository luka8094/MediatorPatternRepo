package mediatorpattern;

abstract class Customer{

    private IRealEstateBroker realEstateBroker;

    public Customer(IRealEstateBroker realEstateBroker){
        this.realEstateBroker = realEstateBroker;
    }

    public abstract double getBid();

}

