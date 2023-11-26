public class Store
{
    private static int storeID = 1;
    private final int SID;
    private final String name;
    private final String address;

    public Store(String n, String add)
    {
        this.name = n;
        this.address = add;
        this.SID = storeID++;
    }

    public int getStoreID()
    {
        return SID;
    }

    @Override
    public String toString()
    {
        return SID + " " + name + " " + address;
    }
}
