import menu.Menu;
import menu.MenuItem;

/**
 * Our application's main menu.
 */
public class MainMenu extends Menu {

    private String userInputValue = null;

    private static MenuItem[] menuItems = new MenuItem[] {
            new MenuItem('1', "Add an animal to the zoo"),
            new MenuItem('2', "Remove and animal from the zoo"),
            new MenuItem('3', "Display a list of animals in the zoo"),
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
    protected boolean handleMenuSelection(char key) {
        switch(Character.toUpperCase(key)) {
            case '1':
                callSubMenu();
                break;
            case '2':
                promptForSomething();
                break;
            case '3':
                displaySomething();
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
    private void callSubMenu() {
        new SubMenu().display();
    }

    /**
     * Demonstrate how to use the prompt() methods built
     * into the Menu class.
     */
    private void promptForSomething() {
        userInputValue = prompt("Please enter the name of the animal you wish to remove: ", true);
        System.out.println("Thank you");
    }

    /**
     * Display the user's input value from the promptForSomething menu.
     */
    private void displaySomething() {
        if (userInputValue == null) {
            System.out.println("No data on file.");
        } else {
            System.out.println("Zoo Database: ");
            System.out.println(userInputValue);
        }
    }

}
