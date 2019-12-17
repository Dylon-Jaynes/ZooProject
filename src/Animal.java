import java.util.ArrayList;

public class Animal {
    //This data is for keeping track of the number of animals in the database.
    public int animalCount = 0;
    public int birdCount = 0;
    public int mammalCount = 0;
    public int giraffeCount = 0;
    public int lionCount = 0;
    public int bearCount = 0;
    public int totalAnimals = 0;
    private String name;
    private String sex;
    private String habitat;

    /**
     * Default animal constructor
     */
    public Animal() {
        name = null;
        sex = null;
        habitat = null;
        animalCount++;
        totalAnimals++;
    }

    /**
     * Animal constructor with parameters
     * @param name
     * @param sex
     * @param habitat
     */
    public Animal(String name, String sex, String habitat) {

    }

    /**
     * Default method for getting the name
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    /**
     * Default method for getting the sex
     * @return
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String value) {
        sex = value;
    }

    /**
     * Default method for getting the habitat
     * @return
     */
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String value) {
        habitat = value;
    }
}
