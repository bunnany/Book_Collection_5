import ecs100.*;
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI
{

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        Books bk = new Books();
        UI.initialise();
        UI.addButton("All", bk::printAll);
        
        UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }

}
