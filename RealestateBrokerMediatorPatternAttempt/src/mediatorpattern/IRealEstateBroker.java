package mediatorpattern;

public interface IRealEstateBroker {

    void settleDeal();

    void setSeller(Seller seller);

    void setBuyer(Buyer buyer);

    void solveBid(Seller seller, Buyer buyer);

}
