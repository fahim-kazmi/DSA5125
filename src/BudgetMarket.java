public class BudgetMarket implements iBudgetMarket
{
    private final SimpleVector<Store> stores;
    private final SimpleVector<Product> products;
    private final SimpleVector<Client> clients;

    public BudgetMarket(int maxStores, int maxProducts, int maxClients)
    {
        stores = new SimpleVector<>();
        products = new SimpleVector<>();
        clients = new SimpleVector<>();
    }

    @Override
    public int addStore(String name, String street)
    {
        Store store = new Store(name, street);
        stores.add(store);
        return store.getStoreID();
    }

    @Override
    public int addProduct(String category, Double price, int storeID)
    {
        Product product = new Product(category, price, storeID);
        products.add(product);
        return product.getProductID();
    }

    @Override
    public int addClient(String name, String email, String street)
    {
        Client client = new Client(name, email, street);
        clients.add(client);
        return client.getClientID();
    }

    @Override
    public void printAllStores()
    {
        for (int i = 0; i < stores.size(); i++)
        {
            System.out.println(stores.get(i));
        }
    }

    @Override
    public void printAllProducts()
    {
        for (int i = 0; i < products.size(); i++)
        {
            System.out.println(products.get(i));
        }
    }

    @Override
    public void printAllClients()
    {
        for (int i = 0; i < clients.size(); i++)
        {
            System.out.println(clients.get(i));
        }
    }

    @Override
    public Store findStore(int storeID)
    {
        for (int i = 0; i < stores.size(); i++)
        {
            Store store = stores.get(i);
            if (store != null && store.getStoreID() == storeID)
            {
                return store;
            }
        }
        return null;
    }

    @Override
    public Product findProduct(int productID)
    {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product != null && product.getProductID() == productID)
            {
                return product;
            }
        }
        return null;
    }

    @Override
    public Client findClient(int clientID)
    {
        for (int i = 0; i < clients.size(); i++)
        {
            Client client = clients.get(i);
            if (client != null && client.getClientID() == clientID)
            {
                return client;
            }
        }
        return null;
    }
}
