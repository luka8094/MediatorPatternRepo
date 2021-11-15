package mediatorpattern;

abstract class Customer{

    IRealestateBroker realestateBroker;

    Customer(IRealestateBroker realestateBroker){
        this.realestateBroker = realestateBroker;
    }

    abstract double getBid();

}
