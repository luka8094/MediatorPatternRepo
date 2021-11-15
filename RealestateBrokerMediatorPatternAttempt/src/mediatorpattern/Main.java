package mediatorpattern;

public class Main {

    public static void main(String[] args) {

        //Instansiate the RealestateBroker
        IRealestateBroker realestateBroker = new RealestateBroker();

        //Instantiate Seller and Buyer and connect them to the RealestateBroker object
        Seller seller = new Seller(realestateBroker, 1000.00);
        Buyer buyer = new Buyer(realestateBroker, 500.00);

        //Reference back to the RealestateBroker object the Seller and Buyer instances
        realestateBroker.setSeller(seller);
        realestateBroker.setBuyer(buyer);

        realestateBroker.settleDeal();

    }
}
