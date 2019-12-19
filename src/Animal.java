import java.util.ArrayList;

public class Animal {
    //This data is for keeping track of the number of animals in the database.
    private String animalName;
    private String animalSex;
    private String animalHabitat;

    /**
     * Default animal constructor
     */
    public Animal() {

        animalName = null;
        animalSex = null;
        animalHabitat = null;
    }

    /**
     * Animal constructor with parameters
     * @param name
     * @param sex
     * @param habitat
     */
    public Animal(String name, String sex, String habitat) {
        animalName = name;
        animalSex = sex;
        animalHabitat = habitat;
    }

    /**
     * Default method for getting the name
     * @return
     */
    public String getName() {
        return animalName;
    }

    public void setName(String value) {
        animalName = value;
    }

    /**
     * Default method for getting the sex
     * @return
     */
    public String getSex() {
        return animalSex;
    }

    public void setSex(String value) {
        animalSex = value;
    }

    /**
     * Default method for getting the habitat
     * @return
     */
    public String getHabitat() {
        return animalHabitat;
    }

    public void setHabitat(String value) {
        animalHabitat = value;
    }
}
