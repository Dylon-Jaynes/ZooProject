/**
 * Class for constructing Lions
 */

public class Lion extends Animal {

    /**
     * Lion Constructor
     **/
    public Lion(String name, String sex, String habitat) {
        super(name, sex, habitat);
        lionCount++;
        mammalCount++;
        totalAnimals++;
    }



}
