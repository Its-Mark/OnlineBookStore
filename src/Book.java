//these are tests

public class Book
{
    private int bookIDNum;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;
    private int publicationYear;
    private int bookStockCount;
    private int bookSoldCount;
    private double bookPrice;

    public String toString()
    {
        String bookInfo = "Available: [Title = " + this.bookTitle + ", Book ID = " +
                this.bookIDNum + ", \nAuthor = " + this.bookAuthor +
                ", Publisher = " + this.bookPublisher +
                ", \nYear of Publication = " + this.publicationYear +
                ", Left in Stock = " + this.bookStockCount +
                ", \nAmount Sold = " + this.bookSoldCount + ", Price = $" +
                this.bookPrice + "]";
        return bookInfo;
    }

    public int getBookIDNum()
    {
        return this.bookIDNum;
    }

    public String getBookTitle()
    {
        return this.bookTitle;
    }

    public String getBookAuthor()
    {
        return this.bookAuthor;
    }

    public String getBookPublisher()
    {
        return this.bookPublisher;
    }

    public int getPublicationYear()
    {
        return this.publicationYear;
    }

    public int getBookStockCount()
    {
        return this.bookStockCount;
    }

    public int getBookSoldCount()
    {
        return this.bookSoldCount;
    }

    public double getBookPrice()
    {
        return this.bookPrice;
    }

    public void bookSale(int copies, Customer c, Book b)
    {
        if (copies < 0){
            System.out.println("That is not a valid input.");
        } else if (bookStockCount < copies) {
            System.out.println("There are not enough copies of that book available.");
        } else {
            bookStockCount -= copies;
            for (int i = 0; i < copies; i++) {
                c.addBook(b);
            }
        }
    }

    public Book(int bookID, String title, String author, String publisher, int publicationYear, int bookStock, double price)
    {
        this.bookIDNum = bookID;
                this.bookTitle = title;
                this.bookAuthor = author;
                this.bookPublisher = publisher;
                this.publicationYear = publicationYear;
                this.bookStockCount = bookStock;
                this.bookPrice = price;

                bookSoldCount = 25;
                }

public void restockBooks(int numBooks)
        {
        if (numBooks >= 1)
        {
        bookStockCount += numBooks;
        } else {
        System.out.println("That is not a valid number of books to restock with.");
        }

        }
        }
