package mediatorpattern;

public class Main {

    public static void main(String[] args) {

        //Instantiate the RealEstateBroker
        IRealEstateBroker realEstateBroker = new RealEstateBroker();

        //Instantiate Seller and Buyer and connect them to the RealEstateBroker object
        Seller seller = new Seller(realEstateBroker, 1000.00);
        Buyer buyer = new Buyer(realEstateBroker, 500.00);

        //Reference back to the RealEstateBroker object the Seller and Buyer instances
        realEstateBroker.setSeller(seller);
        realEstateBroker.setBuyer(buyer);

        realEstateBroker.settleDeal();

    }
}
