
/**
 * Class of Book
 * Contains an id, name, author, quantity, image
 *
 * @author Ny
 * @version (a version number or a date)
 */
public class Book
{
    // fields
    private int id;
    private String name;
    private String author;
    private int quantity;
    private String image;   // to complete
    
    /**
     * Constructor to make the book object
     */
    public Book(int id, String nm, String auth, int qty)
    {
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
    }
    
    /**
     * Getter for ID
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Getter for Name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Getter for Author
     */
    public String getAuthor() {
        return this.author;
    }
    
    /**
     * Getter for Quantity
     */
    public int getQuantity() {
        return this.quantity;
    }
}




