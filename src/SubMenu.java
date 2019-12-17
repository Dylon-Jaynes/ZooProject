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
     * Add a bird to the database
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
        System.out.print("Can this bird fly? true/false: ");
        boolean flight = input.nextBoolean();

        if (name == null || name.trim().length() == 0 || name.trim().length() > 1) {
            System.err.println("You must enter a valid name");
            System.exit(1);
        }
        if (sex == null || sex.trim().length() == 0 || sex.trim().length() > 1) {
            System.err.println("You must enter a valid sex");
            System.exit(1);
        }
        if (habitat == null || habitat.trim().length() == 0 || habitat.trim().length() > 1) {
            System.err.println("You must enter a valid habitat");
            System.exit(1);
        }
        if (color == null || color.trim().length() == 0 || color.trim().length() > 1) {
            System.err.println("You must enter a valid color");
            System.exit(1);
        }
        if (flight == null || flight.trim().length() == 0 || flight.trim().length() > 1) {
            System.err.println("You must select a valid option, true or false");
            System.exit(1);
        }
    }

    /**
     * Add a bear to the database
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

        if (name == null || name.trim().length() == 0 || name.trim().length() > 1) {
            System.err.println("You must enter a valid name");
            System.exit(1);
        }
        if (sex == null || sex.trim().length() == 0 || sex.trim().length() > 1) {
            System.err.println("You must enter a valid sex");
            System.exit(1);
        }
        if (habitat == null || habitat.trim().length() == 0 || habitat.trim().length() > 1) {
            System.err.println("You must enter a valid habitat");
            System.exit(1);
        }
    }

    /**
     * Add a giraffe to the database
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

        if (name == null || name.trim().length() == 0 || name.trim().length() > 1) {
            System.err.println("You must enter a valid name");
            System.exit(1);
        }
        if (sex == null || sex.trim().length() == 0 || sex.trim().length() > 1) {
            System.err.println("You must enter a valid sex");
            System.exit(1);
        }
        if (habitat == null || habitat.trim().length() == 0 || habitat.trim().length() > 1) {
            System.err.println("You must enter a valid habitat");
            System.exit(1);
        }
    }

    /**
     * Add a lion to the database
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

        if (name == null || name.trim().length() == 0 || name.trim().length() > 1) {
            System.err.println("You must enter a valid name");
            System.exit(1);
        }
        if (sex == null || sex.trim().length() == 0 || sex.trim().length() > 1) {
            System.err.println("You must enter a valid sex");
            System.exit(1);
        }
        if (habitat == null || habitat.trim().length() == 0 || habitat.trim().length() > 1) {
            System.err.println("You must enter a valid habitat");
            System.exit(1);
        }
    }
}
