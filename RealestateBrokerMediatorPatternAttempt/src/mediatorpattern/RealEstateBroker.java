package mediatorpattern;

public class RealEstateBroker implements IRealEstateBroker {

    private Buyer buyer;
    private Seller seller;

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setSeller(Seller seller){
        this.seller = seller;
    }

    public void settleDeal(){
        solveBid(seller,buyer);
    }

    public void solveBid(Seller seller, Buyer buyer){
        if(seller.getBid() > buyer.getBid()) System.out.println("Seller says its too low");
        if(seller.getBid() < buyer.getBid()) System.out.println("Seller is sold!");
    }

}
