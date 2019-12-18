/**
 * Class for constructing Giraffes
 */

public class Giraffe extends Animal {

    /**
     * Giraffe Constructor
     **/
    public Giraffe() {
    }

    public Giraffe(String name, String sex, String habitat) {
        super(name, sex, habitat);
        giraffeCount++;
        mammalCount++;
        totalAnimals++;
    }
}
