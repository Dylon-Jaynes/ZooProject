import menu.Menu;
import menu.MenuItem;

/**
 * Our application's main menu.
 */
public class SubMenu extends Menu {

    // Make this static so it stays with the class. This way
    // we can count how many times this SubMenu class gets
    // instantiated.
    private static int callCount = 0;
    private final static String[] countDescriptions = new String[] {
            "", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth",
            "ninth", "tenth"
    };

    private static MenuItem[] menuItems = new MenuItem[] {
            new MenuItem('1', "Submenu Option 1"),
            new MenuItem('2', "Submenu Option 2"),
            new MenuItem('R', "Return to previous menu")
    };

    /**
     * Constructor for the main menu
     */
    public SubMenu() {
        super();
        callCount += 1;
    }

    @Override
    protected String getTitle() {
        return "Sub Menu";
    }

    @Override
    protected String getDescription() {
        // build our description dynamically.
        return String.format("This is the %s time you've called this menu.",
                callCount < countDescriptions.length ? countDescriptions[callCount] : callCount + "th");
    }

    @Override
    protected MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    protected boolean handleMenuSelection(char key) {
        switch(Character.toUpperCase(key)) {
            case '1':
                subMenuOption1();
                break;
            case '2':
                subMenuOption2();
                break;
            case 'R':
                return false;
            default:
                System.out.println("Please enter a valid selection");
        }

        return true;
    }

    /**
     * Do the sub-menu 1 action.
     */
    private void subMenuOption1() {
        System.out.println("You have called sub menu option 1");
    }

    /**
     * Do the sub-menu 2 action.
     */
    private void subMenuOption2() {
        System.out.println("You have called sub menu option 2");
    }
}