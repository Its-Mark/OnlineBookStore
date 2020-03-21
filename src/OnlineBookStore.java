public class OnlineBookStore
{
    public static void main(String[] args)
    {
        Customer C1 = new Customer("Chris", "123 Maple Ave.", 123456);
        Customer C2 = new Customer("Michael", "456 Oak Rd.", 246810);
        Customer C3 = new Customer("Mark", "789 Pine St.", 135792);

        Book B1 = new Book(732957, "The Giving Tree", "Shel Silverstein", "Harper and Row", 1996, 10, 12.99);
        Book B2 = new Book(629573, "Animal Farm: A Fairy Story", "George Orwell", "Secker and Warburg", 1945, 4, 6.78);
        Book B3 = new Book(294643, "Of Mice and Men", "John Steinbeck", "Covici Friede", 1937, 40, 4.39);

        System.out.println(B1 + "\n" + B2 + "\n" + B3 + "\n");

        System.out.println(C1 + "\n" + C2 + "\n" + C3 + "\n");

        System.out.println("The amount in stock of " + B1.getBookTitle() + " before sale: " + B1.getBookStockCount());
        B1.bookSale(5, C1, B1);
        System.out.println("The amount after sale: " + B1.getBookStockCount());

        System.out.println();
        System.out.println("The amount of copies of " + B1.getBookTitle() + " before restock: " + B1.getBookStockCount());
        B1.restockBooks(20);
        System.out.println("The amount after restock: " + B1.getBookStockCount());

        B2.bookSale(1, C1, B2);
        C1.getBooks();
    }
}