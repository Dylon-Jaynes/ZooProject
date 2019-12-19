import menu.Menu;
import menu.MenuItem;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;


/**
 * Our application's main menu.
 */
public class MainMenu extends Menu {

    private String userInputValue = null;
    Scanner input = new Scanner(System.in);

    private static MenuItem[] menuItems = new MenuItem[] {
            new MenuItem('1', "Add an animal to the zoo"),
            new MenuItem('2', "Display a list of zoo animals"),
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
        case 'X':
        return false;
default:
        System.out.println("Please enter a valid selection");
        }

        return true;
        }

/**
 * Transfer program control to the Add Animal sub-menu.
 */
private void callSubMenu() throws IOException {
        new SubMenu().display();
        }

/**
 * Display the animals in the zoo database.
 */
private void displayAnimals() throws IOException {
        System.out.println("Please enter a filename.\n");
        File fileName = new File(input.nextLine());
        new Storage().loadData(fileName);
        }
}
