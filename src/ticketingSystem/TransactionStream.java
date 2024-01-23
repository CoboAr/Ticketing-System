package ticketingSystem;
/**
 *
 * @author Arnold
 */
public class TransactionStream {
    private int code;
    private String eventName;
    private String sellerUser;
    private int ticketQuantity;
    private double price;
    
    TransactionStream(int code, String eventName, String sellerUser, int ticketQuantity, double price){
        this.code = code;
        this.eventName = eventName;
        this.sellerUser = sellerUser;
        this.ticketQuantity = ticketQuantity;
        this.price = price;
    }
}