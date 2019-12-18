import menu.Menu;
import menu.MenuItem;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Our application's main menu.
 */
public class MainMenu extends Menu {

    private String userInputValue = null;

    private static MenuItem[] menuItems = new MenuItem[] {
            new MenuItem('1', "Add an animal to the zoo"),
            new MenuItem('2', "Remove and animal from the zoo"),
            new MenuItem('3', "Display a list of animals in the zoo"),
            new MenuItem('4', "Get a count of animals by species"),
            new MenuItem('X', "Exit Application")
    };

    /**
     * Constructor for the main menu
     */
    public MainMenu() {
        super();
    }

    @Override
    protected String getTitle() {
        return "Main Menu";
    }

    @Override
    protected String getDescription() {
        return null;
    }

    @Override
    protected MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    protected boolean handleMenuSelection(char key) throws IOException {
        switch(Character.toUpperCase(key)) {
            case '1':
                callSubMenu();
                break;
            case '2':
                displayAnimals();
                break;
            case '3':
                break;
            case '4':
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid selection");
        }

        return true;
    }

    /**
     * Transfer program control to the sub-menu.
     */
    private void callSubMenu() throws IOException {
        new SubMenu().display();
    }

    /**
     * Demonstrate how to use the prompt() methods built
     * into the Menu class.
     */
    private void removeAnimal() {
        userInputValue = prompt("Please enter the name of the animal you wish to remove: ", true);
        System.out.println("Thank you");
    }

    /**
     * Display the animals in the zoo database.
     */
    private void displayAnimals() throws IOException {
        new Storage().loadData("zooDatabase");
    }
}
