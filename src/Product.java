public class Product
{
    private static int productID = 1;
    private int prodID;
    private String category;
    private double price;
    private int storeID;

    public Product(String c, double p, int PID)
    {
        this.productID = productID++;
        this.category = c;
        this.price = p;
        this.storeID = PID;
    }

    public int getProductID()
    {
        return productID;
    }

    @Override
    public String toString()
    {
        return "Product ID: " + productID + ", Category: " + category + ", Price: " + price;
    }
}
