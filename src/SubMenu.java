import menu.Menu;
import menu.MenuItem;
import java.util.Scanner;

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
            new MenuItem('1', "Add a Bird"),
            new MenuItem('2', "Add a Bear"),
            new MenuItem('3', "Add a Giraffe"),
            new MenuItem('4', "Add a Lion"),
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
        return "Add an Animal";
    }

    @Override
    protected String getDescription() {
        // build our description dynamically.
        return String.format("This is the %s time you've added an animal.",
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
            case '3':
                subMenuOption3();
                break;
            case '4':
                subMenuOption4();
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
        System.out.println("Fill out the following fields to add a bird:");
        System.out.println();
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Sex: ");
        String sex = input.nextLine();
        System.out.print("Habitat: ");
        String habitat = input.nextLine();
        System.out.print("Color: ");
        String color = input.nextLine();
        System.out.print("Can this bird fly? Y/N: ");
        boolean flight = input.nextBoolean();
    }

    /**
     * Do the sub-menu 2 action.
     */
    private void subMenuOption2() {
        System.out.println("Fill out the following fields to add a bear:");
        System.out.println();
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Sex: ");
        String sex = input.nextLine();
        System.out.print("Habitat: ");
        String habitat = input.nextLine();
    }

    /**
     * Do the sub-menu 3 action.
     */
    private void subMenuOption3() {
        System.out.println("Fill out the following fields to add a giraffe:");
        System.out.println();
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Sex: ");
        String sex = input.nextLine();
        System.out.print("Habitat: ");
        String habitat = input.nextLine();
    }

    /**
     * Do the sub-menu 4 action.
     */
    private void subMenuOption4() {
        System.out.println("Fill out the following fields to add a lion:");
        System.out.println();
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Sex: ");
        String sex = input.nextLine();
        System.out.print("Habitat: ");
        String habitat = input.nextLine();
    }
}
