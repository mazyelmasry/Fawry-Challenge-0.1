public class Paperbook extends Book implements ShippingService
{
    private int stock;

    public Paperbook(String ISBN, String title, int publishYear, double price, int stock)
    {
        super(ISBN, title, publishYear, price);
        this.stock = stock;
    }

    public int getStock()
    {
        return stock;
    }

    public void increaseStock(int quantity) {
        stock = stock + quantity;
    }

    public void decreaseStock(int quantity) {
        stock = stock - quantity;
    }

    @Override
    public void purchaseBook(String ISBN, int quantity, String email, String address)
    {
        if(stock < quantity)
        {
            System.out.println("No enough stock");
        }
        else
        {
            decreaseStock(quantity);
            System.out.println("Shipping " + quantity + " copies of " + getTitle() + " to " + address);
        }
    }

    @Override
    public void shippingInfo(String address)
    {
        System.out.println("Sending shipping info to " + address);
    }
}
