import ecs100.*;
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
    private String image;
    static final String DEFAULT_IMAGE = "book.png";
    
    /**
     * Constructor to make the book object
     */
    public Book(int id, String nm, String auth, int qty, String img)
    {
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
        this.image = img;
    }
    
    /**
     * Constructor overloading
     */
    public Book(int id, String nm, String author, int qty)
    {
        this(id, nm, author, qty, DEFAULT_IMAGE);
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
    
    /**
     * Display our image on our GUI
     */
    public void displayBook() {
        int locX = 100;
        int locY = 100;
        final int WIDTH = 100;
        final int HEIGHT = 100;
        
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
    }
}




