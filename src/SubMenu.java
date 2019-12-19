import menu.Menu;
import menu.MenuItem;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Our application's main menu.
 */
public class SubMenu extends Menu {

    Scanner input = new Scanner(System.in);
    public ArrayList<Animal> zooAnimals = new ArrayList<>();

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
    }

    @Override
    protected String getTitle() {
        return "Add an Animal";
    }

    @Override
    protected MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    protected boolean handleMenuSelection(char key) throws IOException {
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
                System.out.println("\nPlease enter a name for a new file.");
                File fileName = new File(input.nextLine());
                new Storage().storeData(fileName, zooAnimals);
                return false;
            default:
                System.out.println("Please enter a valid selection");
        }

        return true;
    }

    /**
     * Add a bird to the database, validate values entered
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
        String flight = input.nextLine();

        if (name == null || name.trim().length() == 0) {
            System.err.println("You must enter a valid name");
            System.exit(1);
        }
        if (sex == null || sex.trim().length() == 0) {
            System.err.println("You must enter a valid sex");
            System.exit(1);
        }
        if (habitat == null || habitat.trim().length() == 0) {
            System.err.println("You must enter a valid habitat");
            System.exit(1);
        }
        if (color == null || color.trim().length() == 0) {
            System.err.println("You must enter a valid color");
            System.exit(1);
        }
        //ERROR: It could be false but it won't except null
        if (flight == null || flight.trim().length() == 0) {
            System.err.println("You must select a valid option, true or false");
            System.exit(1);
        }
        zooAnimals.add(new Bird(name, sex, habitat, color, flight));
    }

    /**
     * Add a bear to the database, validate values entered
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

        if (name == null || name.trim().length() == 0) {
            System.err.println("You must enter a valid name");
            System.exit(1);
        }
        if (sex == null || sex.trim().length() == 0) {
            System.err.println("You must enter a valid sex");
            System.exit(1);
        }
        if (habitat == null || habitat.trim().length() == 0) {
            System.err.println("You must enter a valid habitat");
            System.exit(1);
        }
        zooAnimals.add(new Bear(name, sex, habitat));
    }

    /**
     * Add a giraffe to the database, validate values entered
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

        if (name == null || name.trim().length() == 0) {
            System.err.println("You must enter a valid name");
            System.exit(1);
        }
        if (sex == null || sex.trim().length() == 0) {
            System.err.println("You must enter a valid sex");
            System.exit(1);
        }
        if (habitat == null || habitat.trim().length() == 0) {
            System.err.println("You must enter a valid habitat");
            System.exit(1);
        }
        zooAnimals.add(new Giraffe(name, sex, habitat));
    }

    /**
     * Add a lion to the database, validate values entered
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

        if (name == null || name.trim().length() == 0) {
            System.err.println("You must enter a valid name");
            System.exit(1);
        }
        if (sex == null || sex.trim().length() == 0) {
            System.err.println("You must enter a valid sex");
            System.exit(1);
        }
        if (habitat == null || habitat.trim().length() == 0) {
            System.err.println("You must enter a valid habitat");
            System.exit(1);
        }
        zooAnimals.add(new Lion(name, sex, habitat));
    }
}
