public class Customer
{
    private String customerName;
    private int customerAccountID;
    private String customerAddress;
    private int creditCardNum;
    private String password;

    private Book[] booksBought;
    //an array of Book objects that this customer buys. To be clear, this is not an array of
    //Strings with just the titles of the books.

    private int numPurchases;
    //a count of how many books this customer has bought. (This will tell you how many
    //cells in the Book array are currently being used.)

    public String toString()
    {
        String customerInfo = "Customer [ Name = " + this.customerName + ", Account ID = " +
                this.customerAccountID + ", Address = " + this.customerAddress +
                " ]";
        return customerInfo;
    }

    public String getCustomerAddress()
    {
        return this.customerAddress;
    }

    public int getCustomerAccountID()
    {
        return this.customerAccountID;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public int getCreditCarNum()
    {
        return this.creditCardNum;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void getBooks()
    {
        System.out.println("Books Bought by " + this.getCustomerName() + ": ");
        for(Book b : booksBought){
            if( b != null){
                System.out.println(b + "\n");
            }
        }
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setAddress(String address)
    {
        this.customerAddress = address;
    }

    public void setCreditCarNum(int creditCardNum)
    {
        this.creditCardNum = creditCardNum;
    }

    public Customer(String name, String address, int ID)
    {
        this.customerName = name;
        this.customerAddress = address;
        this.customerAccountID = ID;

        booksBought = new Book[500];
        numPurchases = 0;
    }

    public void addBook(Book b)
    {
        booksBought[numPurchases] = b;
        numPurchases++;
    }
}
