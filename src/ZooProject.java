import menu.Menu;
import java.util.ArrayList;

public class ZooProject {
    public static void main(String[] args) {
        ArrayList<Animal> zooAnimals = new ArrayList<>();
        System.out.println();
        System.out.println("Welcome to our zoo. We hope you like it.");
        System.out.println();

        Menu.delay(1500);

        new MainMenu().display();

        System.out.println("Thank you for checking out our zoo!");
        Menu.delay(1500);


    }
}