import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.Arrays;
import ecs100.*;
/**
 * Holds a collection of books in a hashmap
 * Allows a user to add, find, print all, edit, delete from a menu
 * Prevent the user from adding a duplicate book
 * Prevent user from being able to add more than 20 titles
 *
 * @author Ny
 * @version (a version number or a date)
 */
public class Books
{
    // instance variables
    private HashMap<Integer, Book> booksMap;        // declaring the hashmap
    private int currBookId;         // stores the current Id of the book being added

    /**
     * Constructor for objects of class Books
     */
    public Books()
    {
        booksMap = new HashMap<Integer, Book>();    // initialise hashmap
        
        // Creating Books
        Book b1 = new Book(1, "Pet Semetary", "Stephen King", 8);
        Book b2 = new Book(2, "Otherland", "Tad Williams", 3);
        Book b3 = new Book(3, "Spear of the Emperor", "Benski Bowden", 18);
        
        // Adding Books to map
        booksMap.put(1, b1);
        booksMap.put(2, b2);
        booksMap.put(3, b3);
        
        currBookId = 3; // initialise the book id
        //menu();
    }

    public void addBook() {
        final int MAX_QUANTITY = 99;
        int quantity = -1;
        
        // Ask the user for details
        String name = UI.askString("Title: ");
        String author = UI.askString("Author: ");
        
        // check boundaries for the number of books added to stock
        do {
            quantity = UI.askInt("Quantity: ");
        } while (0 > quantity || quantity > MAX_QUANTITY);
        
        // add a book image for display in the GUI
        String imgFileName = UIFileChooser.open("Choose Image File: ");
        
        // Increment the book ID counter and add to hashmap
        currBookId++;
        booksMap.put(currBookId, new Book(currBookId, name, author, quantity, imgFileName));
    }
    
    public void findBook() {
        // To refactor by search by title
        int bookId = UI.askInt("Id: "); // Finds book based on ID, not great should be title
        booksMap.get(bookId).getName();
        booksMap.get(bookId).displayBook();
    }
    
    public void printAll() {
        // Traversing Map
        for (int bookId : booksMap.keySet()) {
            UI.println(bookId + "Details:");
            UI.println(booksMap.get(bookId).getName() + " "
                     + booksMap.get(bookId).getAuthor() + " "
                     + booksMap.get(bookId).getQuantity());
        }
    }
    
    /**
     * Menu to print and call appropriate methods
     */
    public void menu() {
        
        // List of options
        //ArrayList<String> choices = new ArrayList<>(Arrays.asList("A", "P", "Q"));
        
        // Print menu and force choice
        String choice;
        do {
            UI.println("(A)dd a book");
            UI.println("(F)ind a book");
            UI.println("(P)rint all");
            UI.println("(Q)uit");
            
            choice = UI.askString("Enter a choice");
            
            if (choice.equalsIgnoreCase("A")) {
                addBook();
            } else if (choice.equalsIgnoreCase("F")) {
                findBook();
            } else if (choice.equalsIgnoreCase("P")) {
                printAll();
            } else if (choice.equalsIgnoreCase("Q")) {
                UI.println("Goodbye!");
                UI.quit();
            } else {
                UI.println("That is not a choice you knucklehead.");
            }
        } while (!choice.equalsIgnoreCase("Q"));//(!choices.contains(choice));    
    }
}




