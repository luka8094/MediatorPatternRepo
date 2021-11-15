package mediatorpattern;

public interface IRealestateBroker {

    void settleDeal();

    void setSeller(Seller seller);

    void setBuyer(Buyer buyer);

    void solveBid(Seller seller, Buyer buyer);

}
